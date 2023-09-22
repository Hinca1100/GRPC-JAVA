package co.com.bancodebogota.controllers;

import co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest;
import co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse;
import co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest;
import co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse;
import co.com.bancodebogota.services.impl.RandomNumberService;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.helpers.test.AssertSubscriber;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;
import java.util.UUID;


@QuarkusTest
class RandomNumberControllerTest {

    @Spy
    RandomNumberService randomNumberService;
    @InjectMocks
    RandomNumberController randomNumberController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGeneratedNumbers() {

        GeneratedNumbersRequest request = GeneratedNumbersRequest.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setMinRange(-10)
                .setMaxRange(10)
                .build();

        Uni<GeneratedNumbersResponse> result = randomNumberController.generatedNumbers(request);

        UniAssertSubscriber<GeneratedNumbersResponse> subscriber = result
                .subscribe().withSubscriber(UniAssertSubscriber.create());

        GeneratedNumbersResponse resultValue = subscriber.assertCompleted().getItem();

        Assertions.assertNotNull(resultValue);

    }

    @Test
    void testGeneratedMultipleSecureRandom() {

        GeneratedMultipleSecureRandomRequest request = GeneratedMultipleSecureRandomRequest.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .build();

        Multi<GeneratedMultipleSecureRandomResponse> result = randomNumberController.generatedMultipleSecureRandom(request);

        Multi<Integer> multi = Multi.createFrom().range(1, 5)
                .onItem().transform(n -> n * 10);

        AssertSubscriber<GeneratedMultipleSecureRandomResponse> subscriber = result
                .subscribe().withSubscriber(AssertSubscriber.create(4));

        List<GeneratedMultipleSecureRandomResponse> resultValue = subscriber.awaitItems(4).getItems();

        Assertions.assertNotNull(resultValue);
        Assertions.assertFalse(resultValue.isEmpty());
        Assertions.assertEquals(4, resultValue.size());
    }

}
