package com.rps.service;

public class Options {

    private String option = "0";
    public static final String EXIT = "x";
    public static final String NEW = "n";
    public static final String ROCK = "rock";
    public static final String SCISSORS = "scissors";
    public static final String PAPER = "paper";
    private MessagePrinter messagePrinter = new MessagePrinter();


    public String allOptions() {

        messagePrinter.printAllOptions();

        while (option != null) {
            option = KeyboardReader.getReadString().toLowerCase();
            String isShape = shapesPickOptions(option);
            String isExitOrNew = exitOrNewGameWithConfirm(option);

            if (isShape!= null) {
                return isShape;
            } else if (isExitOrNew != null) {
                return isExitOrNew;
            }
            messagePrinter.printAllOptions();
        }

        return option;
    }

    public String exitOrNewGameWithConfirm(String option) {

        if (option.equals(EXIT)) {
            System.out.println("Exit Game ?");
            if (messagePrinter.confirm()) {
                return EXIT;
            }
        } else if (option.equals(NEW)) {
            System.out.println("New Game ?");
            if (messagePrinter.confirm()) {
                return NEW;
            }
        }

        return null;
    }

    public boolean exitGame(String option) {
        if (option.equals(EXIT)) {
            return true;
        }
        return false;
    }

    public boolean startNewGame(String option) {
        if (option.equals(NEW)) {
            GameStarter gameStarter = new GameStarter();
            gameStarter.startGame();
            return true;
        }
        return false;
    }

    public String shapesPickOptions(String option) {

        if (option.equals("1")) {
            return ROCK;
        } else if (option.equals("2")) {
            return PAPER;
        } else if (option.equals("3")) {
            return SCISSORS;
        }
        return null;
    }
}
