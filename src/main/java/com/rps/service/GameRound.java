package com.rps.service;

public class GameRound {

    public boolean GameRound(String option) {

        Options options = new Options();
        if (options.exitGame(option) || options.startNewGame(option)) {
            return true;
        }

        CheckShapes checkShapes = new CheckShapes();
        String results = checkShapes.checkShapes(option);
        System.out.println("Winner is: " + results);
        return false;
    }
}
