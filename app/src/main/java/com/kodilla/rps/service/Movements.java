package com.kodilla.rps.service;

public class Movements {

    private String option = "0";
    public static final String EXIT = "x";
    public static final String NEW = "n";
    public static final String ROCK = "rock";
    public static final String SCISSORS = "scissors";
    public static final String PAPER = "paper";


    public String options() {
        System.out.println("Options: ");
        System.out.println("[1] Rock");
        System.out.println("[2] Paper");
        System.out.println("[3] Scissors");
        System.out.println("[x] End of Game");
        System.out.println("[n] New Game");

        while (option != null) {
            option = KeyboardReader.getReadString().toLowerCase();

            if (option.equals("1")) {
                return ROCK;
            } else if (option.equals("2")) {
                return PAPER;
            } else if (option.equals("3")) {
                return SCISSORS;
            } else if (option.equals("x")) {
                return EXIT;
            } else if (option.equals("n")) {
                return NEW;
            } else option = null;

        }
        return option;

    }
}
