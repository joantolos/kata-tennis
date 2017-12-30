package com.joantolos.kata.tennis.domain;

import com.joantolos.kata.tennis.ScoreNames;

public class Score {

    private Integer[] raw;
    private ScoreNames playerOne;
    private ScoreNames playerTwo;

    public Score() {
        this.raw = new Integer[2];
        this.raw[0] = 0;
        this.raw[1] = 0;
    }

    public Integer[] getRaw() {
        return raw;
    }

    public void setPlayerOne(ScoreNames playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(ScoreNames playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String prettify() {
        if(playerOne.equals(playerTwo)) return playerOne.getName();
        return playerOne.getName() + " - " + playerTwo.getName();
    }
}
