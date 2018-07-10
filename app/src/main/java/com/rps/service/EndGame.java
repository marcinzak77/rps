package com.rps.service;

public class EndGame {
    private String option = null;
    private ExitOrNewGame exitOrNewGame = new ExitOrNewGame();

    public boolean EndGame(){
        PrintOptions printOptions = new PrintOptions();
        printOptions.printNewExitOptions();

        boolean optionAvailable = false;
        while (!optionAvailable) {
            option = KeyboardReader.getReadString().toLowerCase();
            if ((option.equals("x")) || (option.equals("n"))) {
                optionAvailable = true;
            }
            printOptions.printNewExitOptions();
        }

        if (exitOrNewGame.ExitOrNewGam(option)) {
            return true;
        }

        return false;
    }
}
