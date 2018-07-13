package com.rps.service;

public class PrintGameSummary {

    public void printGameSummary(int rounds) {
        System.out.println("Hi " + GameDetails.getInstance().getName() + " Total rounds so far: " + rounds);
        System.out.println("Your wins: " + WinCounter.getInstance().getWin() + " Your lost: " + WinCounter.getInstance().getLost());
    }
}
