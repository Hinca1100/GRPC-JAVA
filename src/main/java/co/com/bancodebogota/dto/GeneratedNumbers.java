package co.com.bancodebogota.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneratedNumbers {

    private Integer randomWithNextInt;
    private Integer randomWithThreadLocalRandom;
    private Integer randomWithSecureRandom;

    public Integer getRandomWithNextInt() {
        return randomWithNextInt;
    }

    public void setRandomWithNextInt(Integer randomWithNextInt) {
        this.randomWithNextInt = randomWithNextInt;
    }

    public Integer getRandomWithThreadLocalRandom() {
        return randomWithThreadLocalRandom;
    }

    public void setRandomWithThreadLocalRandom(Integer randomWithThreadLocalRandom) {
        this.randomWithThreadLocalRandom = randomWithThreadLocalRandom;
    }

    public Integer getRandomWithSecureRandom() {
        return randomWithSecureRandom;
    }

    public void setRandomWithSecureRandom(Integer randomWithSecureRandom) {
        this.randomWithSecureRandom = randomWithSecureRandom;
    }
}
