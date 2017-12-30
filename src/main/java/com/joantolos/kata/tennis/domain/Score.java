package com.joantolos.kata.tennis.domain;

public class Score {

    private Integer[] raw;
    private String playerOne;
    private String playerTwo;

    public Score() {
        this.playerOne = "";
        this.playerTwo = "";
        this.raw = new Integer[2];
        this.raw[0] = 0;
        this.raw[1] = 0;
    }

    public Integer[] getRaw() {
        return raw;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }
}
