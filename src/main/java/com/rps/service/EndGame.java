package com.rps.service;

import static com.rps.service.Options.EXIT;
import static com.rps.service.Options.NEW;

public class EndGame {
    private String option = null;
    private Options options = new Options();

    public boolean EndGame(){
        MessagePrinter printOptions = new MessagePrinter();
        printOptions.printNewExitOptions();

        boolean optionAvailable = false;
        while (!optionAvailable) {
            option = KeyboardReader.getReadString().toLowerCase();
            if ((option.equals(EXIT)) || (option.equals(NEW))) {
                optionAvailable = true;
            }
            printOptions.printNewExitOptions();
        }

        if (options.exitGame(option) || options.startNewGame(option)) {
            return true;
        }

        return false;
    }
}
