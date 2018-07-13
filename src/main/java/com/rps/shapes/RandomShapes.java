package com.rps.shapes;

import java.util.Random;

public class RandomShapes {

    public String generateRandomShape() {

        Random generator = new Random();
        int randomNumber = generator.nextInt(3);

        if (randomNumber == 0) {
            return Options.PAPER;
        } else if (randomNumber == 1) {
            return Options.ROCK;
        } else {
            return Options.SCISSORS;
        }
    }

}
