package com.joantolos.kata.tennis;

public class Game {

    private Integer[] raw;

    public Game() {
        this.raw = new Integer[2];
        this.raw[0] = 0;
        this.raw[1] = 0;
    }

    public void scorePoint(Integer playerId) {
        raw[playerId - 1] = raw[playerId - 1] + 1;
    }

    public String getScore() {

        return "";
    }
}
