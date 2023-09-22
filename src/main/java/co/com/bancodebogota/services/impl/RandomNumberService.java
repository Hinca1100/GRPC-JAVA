package co.com.bancodebogota.services.impl;

import co.com.bancodebogota.dto.GeneratedNumbers;
import co.com.bancodebogota.services.IRandomNumberService;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@ApplicationScoped
public class RandomNumberService implements IRandomNumberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomNumberService.class);
    private final Random random = new Random(); //NOSONAR

    @Override
    public Uni<GeneratedNumbers> generateNumber(String rqUid, int min, int max) {
        GeneratedNumbers generatedNumbers = new GeneratedNumbers();
        generatedNumbers.setRandomWithSecureRandom(this.setRandomWithSecureRandom(rqUid));
        generatedNumbers.setRandomWithNextInt(this.setRandomWithNextInt(rqUid, min, max));
        generatedNumbers.setRandomWithThreadLocalRandom(this.setRandomWithThreadLocalRandom(rqUid));
        LOGGER.info("[{}] Numbers have been generated successfully", rqUid);
        return Uni.createFrom().item(generatedNumbers);
    }

    @Override
    public Multi<Integer> generatedSecureRandom(String rqUid) {
        return Multi.createFrom().items(
                this.setRandomWithSecureRandom(rqUid),
                this.setRandomWithSecureRandom(rqUid),
                this.setRandomWithSecureRandom(rqUid),
                this.setRandomWithSecureRandom(rqUid)
        );
    }

    private Integer setRandomWithSecureRandom(String rqUid) {
        LOGGER.debug("[{}] SecureRandom number generation starts", rqUid);
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt();
    }

    private Integer setRandomWithNextInt(String rqUid, int min, int max) {
        LOGGER.debug("[{}] RandomWithNextInt number generation starts", rqUid);
        return random.nextInt(max - min) + min;
    }

    private Integer setRandomWithThreadLocalRandom(String rqUid) {
        LOGGER.debug("[{}] RandomWithThreadLocalRandom number generation starts", rqUid);
        return ThreadLocalRandom.current().nextInt(); //NOSONAR
    }

}
