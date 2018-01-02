package com.joantolos.kata.tennis;

import com.joantolos.kata.tennis.score.Score;

public class Game {

    private Integer[] rawScore;
    private String playerOneName;
    private String playerTwoName;

    public Game(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.rawScore = new Integer[2];
        this.rawScore[0] = 0;
        this.rawScore[1] = 0;
    }

    public void scorePoint(Integer playerId) {
        rawScore[playerId - 1] = rawScore[playerId - 1] + 1;
    }

    public String getPrettyScore() {
        return Score.calculate(rawScore[0], rawScore[1], playerOneName, playerTwoName);
    }

}