package com.rps.service;

public class GameRound {

    public boolean GameRound(String option) {

        if (option.equals("x")) {
            return true;
        } else if (option.equals("n")) {
            WinCounter.getInstance().setWin(0);
            WinCounter.getInstance().setLost(0);
            GameStarter gameStarter = new GameStarter();
            gameStarter.startGame();
            return true;
        }

        CheckShapes checkShapes = new CheckShapes();
        String results = checkShapes.checkShapes(option);
        System.out.println("Winner is: " + results);
        return false;
    }
}
