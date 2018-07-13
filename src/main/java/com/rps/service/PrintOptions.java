package com.rps.service;

public class PrintOptions {

    public void printAllOptions() {
        System.out.println("Options: ");
        printMovementOptions();
        printNewExitOptions();
    }

    public void printMovementOptions() {
        System.out.println("[1] Rock");
        System.out.println("[2] Paper");
        System.out.println("[3] Scissors");
    }

    public void printNewExitOptions() {
        System.out.println("[x] End of Game");
        System.out.println("[n] New Game");
    }
}
