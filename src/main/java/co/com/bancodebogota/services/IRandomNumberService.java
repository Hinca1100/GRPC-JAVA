package co.com.bancodebogota.services;

import co.com.bancodebogota.dto.GeneratedNumbers;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

public interface IRandomNumberService {

    Uni<GeneratedNumbers> generateNumber(String rqUid, int min, int max);
    Multi<Integer> generatedSecureRandom(String rqUid);

}
