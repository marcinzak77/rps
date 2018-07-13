package com.rps.service;

public class GameStarter {

    private boolean done = false;
    private String option;
    int rounds = 0;

    public void startGame() {

        new CreateGameDetails();
        GameRound gameRound = new GameRound();
        MessagePrinter messagePrinter = new MessagePrinter();

        while (!done) {
            rounds++;
            messagePrinter.printGameSummary(rounds);
            Options options = new Options();
            option = options.allOptions();
            done = gameRound.GameRound(option);

            if (rounds >= GameDetails.getInstance().getRounds()) {
                System.out.println("Game summary:");
                messagePrinter.printGameSummary(rounds);
                EndGame endGame = new EndGame();
                endGame.EndGame();
                done = true;
            }
        }



    }
}
