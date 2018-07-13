package com.rps.service;

public class MessagePrinter {

    public boolean confirm() {

            System.out.println("Are You sure? [Y]es/{N]o");
            char response = KeyboardReader.getReadString().toLowerCase().charAt(0);
            if (response == 'y') {
                return true;
            }

        return false;
    }

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

    public void printGameSummary(int rounds) {
        System.out.println("Hi " + GameDetails.getInstance().getName() + " Total rounds so far: " + rounds);
        System.out.println("Your wins: " + WinCounter.getInstance().getWin() + " Your lost: " + WinCounter.getInstance().getLost());

    }

}
