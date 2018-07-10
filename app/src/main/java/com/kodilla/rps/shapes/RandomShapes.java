package com.kodilla.rps.shapes;

import com.kodilla.rps.service.Movements;

import java.util.Random;

public class RandomShapes {

    public String generateRandomShape() {

        Random generator = new Random();
        int randomNumber = generator.nextInt(3);

        if (randomNumber == 0) {
            return Movements.PAPER;
        } else if (randomNumber == 1) {
            return Movements.ROCK;
        } else {
            return Movements.SCISSORS;
        }
    }

}
