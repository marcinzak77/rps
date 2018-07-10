package com.kodilla.rps;

import com.kodilla.rps.service.CheckShapes;
import com.kodilla.rps.service.GameRound;
import org.junit.Assert;
import org.junit.Test;

public class GameRoundTestSuite {

    @Test
    public void testGameRoundOptions() {
        //Given
        String option = "1";
        GameRound gameRound = new GameRound();

        //When
        boolean results = gameRound.GameRound(option);

        //Then
        Assert.assertEquals(false, results);

    }

    @Test
    public void testGameRoundOptionsExit() {
        //Given
        String option = "x";
        GameRound gameRound = new GameRound();

        //When
        boolean results = gameRound.GameRound(option);

        //Then
        Assert.assertEquals(true, results);
    }

    @Test
    public void testCheckShapes1000Round() {
        //Given
        String option = "paper";
        CheckShapes checkShapes = new CheckShapes();
        int winCounter = 0;
        int lostCounter = 0;
        int drawCounter = 0;

        //When
         for (int i = 0; i < 1000; i++) {
            String results = checkShapes.checkShapes(option);

            if (results.equals(option)) {
                winCounter++;
            } else if(results.equals("Draw !")) {
                drawCounter++;
            } else lostCounter++;
        }

        //Then
        System.out.println("win: " + winCounter + "lost: " + lostCounter + "draw: " + drawCounter);
    }
}
