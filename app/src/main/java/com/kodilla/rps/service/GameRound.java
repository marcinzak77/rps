package com.kodilla.rps.service;

import com.kodilla.rps.shapes.Shapes;

import java.util.ArrayList;
import java.util.HashMap;

public class GameRound {

    public boolean GameRound(String option) {

        if (option.equals("x")) {
            System.out.println("Exit Game");
            if (Confirmation.confirm(option)) {
               return true;
            }
        } else if (option.equals("n")) {
                System.out.println("New Game");
                if (Confirmation.confirm(option)) {
                    GameStarter gameStarter = new GameStarter();
                    gameStarter.startGame();
                    return true;
                }
        }

        CheckShapes checkShapes = new CheckShapes();
        String results = checkShapes.checkShapes(option);
        System.out.println("Winner is: " + results);
        return false;
    }
}
