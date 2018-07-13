package com.rps.service;

public class GameRound {

    public boolean GameRound(String option) {

        ExitOrNewGame exitOrNewGame = new ExitOrNewGame();
        if (exitOrNewGame.ExitOrNewGam(option)) {
            return true;
        }

        CheckShapes checkShapes = new CheckShapes();
        String results = checkShapes.checkShapes(option);
        System.out.println("Winner is: " + results);
        return false;
    }
}
