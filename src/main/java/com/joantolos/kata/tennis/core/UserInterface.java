package com.joantolos.kata.tennis.core;

public class UserInterface {

    public Boolean prompt(){
        System.out.println("  _______               _     ");
        System.out.println(" |__   __|             (_)    ");
        System.out.println("    | | ___ _ __  _ __  _ ___ ");
        System.out.println("    | |/ _ \\ '_ \\| '_ \\| / __|");
        System.out.println("    | |  __/ | | | | | | \\__ | ");
        System.out.println("    |_|\\___|_| |_|_| |_|_|___/");
        System.out.println("");
        return true;
    }

    public Boolean print(String toPrint){
        System.out.println(toPrint);
        return true;
    }

    public Boolean exit() {
        System.out.print("\nBye!\n\n");
        return true;
    }
}
