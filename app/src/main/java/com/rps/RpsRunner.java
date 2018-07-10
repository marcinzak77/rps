package com.rps;

import com.rps.service.GameStarter;

public class RpsRunner {
    public static void main(String[] args) {

        GameStarter gameStarter = new GameStarter();
        gameStarter.startGame();

        System.out.println("Game over.");
    }
}
