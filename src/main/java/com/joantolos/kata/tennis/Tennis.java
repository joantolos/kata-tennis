package com.joantolos.kata.tennis;

import com.joantolos.kata.tennis.core.Game;
import com.joantolos.kata.tennis.core.UserInterface;

import java.util.Scanner;

public class Tennis {

    public static void main (String[] args){
        UserInterface ui = new UserInterface();
        ui.prompt();

        ui.print("Please enter player one name: ");
        String playerOneName = new Scanner(System.in).nextLine();
        ui.print("Please enter player two name: ");
        String playerTwoName = new Scanner(System.in).nextLine();
        ui.print("Press enter to start the game...");
        new Scanner(System.in).nextLine();

        Game game = new Game(ui, playerOneName, playerTwoName);
        game.start();
        ui.exit();
    }
}
