package com.rps.service;

public class Movements {

    private String option = "0";
    public static final String EXIT = "x";
    public static final String NEW = "n";
    public static final String ROCK = "rock";
    public static final String SCISSORS = "scissors";
    public static final String PAPER = "paper";


    public String options() {

        PrintOptions printOptions = new PrintOptions();
        printOptions.printOptions();

        while (option != null) {
            option = KeyboardReader.getReadString().toLowerCase();

            if (option.equals("1")) {
                return ROCK;
            } else if (option.equals("2")) {
                return PAPER;
            } else if (option.equals("3")) {
                return SCISSORS;
            } else if (option.equals("x")) {
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
            printOptions.printOptions();
        }
            return option;
    }
}
