package com.joantolos.kata.tennis.domain;

import java.util.Random;

public class Luck {

    public static Integer randomPointWinner() {
        return new Random().nextInt(2) + 1;
    }
}
