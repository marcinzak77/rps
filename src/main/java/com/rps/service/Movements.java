package com.rps.service;

public class Movements {

    private String option = "0";
    public static final String EXIT = "x";
    public static final String NEW = "n";
    public static final String ROCK = "rock";
    public static final String SCISSORS = "scissors";
    public static final String PAPER = "paper";
    private PrintOptions printOptions = new PrintOptions();


    public String allOptions() {

        printOptions.printAllOptions();

        while (option != null) {
            option = KeyboardReader.getReadString().toLowerCase();
            String isShape = shapesPickOptions(option);
            String isExitOrNew = exitNewGameOptions(option);

            if (isShape!= null) {
                return isShape;
            } else if (isExitOrNew != null) {
                return isExitOrNew;
            }
            printOptions.printAllOptions();
        }

        return option;
    }

    public String exitNewGameOptions(String option) {

        if (option.equals("x")) {
            System.out.println("Exit Game ?");
            if (Confirmation.confirm()) {
                return EXIT;
            }
        } else if (option.equals("n")) {
                System.out.println("New Game ?");
                if (Confirmation.confirm()) {
                    return NEW;
                }
        }

        return null;
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