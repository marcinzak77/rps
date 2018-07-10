package com.rps.service;

public class GameStarter {

    private boolean done = false;
    private String option;
    int rounds = 0;

    public void startGame() {

        new CreateGameDetails();
        GameRound gameRound = new GameRound();
        PrintGameSummary printGameSummary = new PrintGameSummary();

        while (!done) {
            rounds++;
            printGameSummary.printGameSummary(rounds);
            Movements movements = new Movements();
            option = movements.allOptions();
            done = gameRound.GameRound(option);

            if (rounds >= GameDetails.getInstance().getRounds()) {
                System.out.println("Game summary:");
                printGameSummary.printGameSummary(rounds);
                EndGame endGame = new EndGame();
                endGame.EndGame();
                done = true;
            }
        }



    }
}
