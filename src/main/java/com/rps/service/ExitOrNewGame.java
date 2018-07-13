package com.rps.service;

public class ExitOrNewGame {

    public boolean ExitOrNewGam(String option) {
        if (option.equals("x")) {
            return true;
        } else if (option.equals("n")) {
            GameStarter gameStarter = new GameStarter();
            gameStarter.startGame();
            return true;
        }

        return false;
    }
}
