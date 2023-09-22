package co.com.bancodebogota.controllers;

import co.com.bancodebogota.number.generation.grpc.*;
import co.com.bancodebogota.services.IRandomNumberService;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

@GrpcService
public class RandomNumberController implements NumberGeneration {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomNumberController.class);

    @Inject
    IRandomNumberService randomNumberService;

    @Override
    public Uni<GeneratedNumbersResponse> generatedNumbers(GeneratedNumbersRequest request) {
        String rqUid = request.getRequestId();
        LOGGER.info("[{}] Number generation starts", rqUid);
        return randomNumberService.generateNumber(rqUid, request.getMinRange(), request.getMaxRange())
                .onItem().ifNotNull().transform(item ->
                        GeneratedNumbersResponse.newBuilder()
                                .setRandomWithNextInt(item.getRandomWithNextInt())
                                .setRandomWithSecureRandom(item.getRandomWithSecureRandom())
                                .setRandomWithThreadLocalRandom(item.getRandomWithThreadLocalRandom())
                                .build());
    }

    @Override
    public Multi<GeneratedMultipleSecureRandomResponse> generatedMultipleSecureRandom(GeneratedMultipleSecureRandomRequest request) {
        String rqUid = request.getRequestId();
        LOGGER.info("[{}] Secure random number generation starts", rqUid);
        // this delay is just for postman test
        Multi<Long> ticks = Multi.createFrom().ticks().every(Duration.ofSeconds(2))
                .onOverflow().drop();

        // you can return this directly
        Multi<GeneratedMultipleSecureRandomResponse> result =
                randomNumberService.generatedSecureRandom(rqUid)
                .onItem().transform(item ->
                        GeneratedMultipleSecureRandomResponse.newBuilder()
                                .setRandomWithSecureRandom(item)
                                .build()
                );

        return Multi.createBy().combining().streams(ticks, result)
                .using((x, random) -> random);
    }

}
