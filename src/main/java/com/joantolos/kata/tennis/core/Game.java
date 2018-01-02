package com.joantolos.kata.tennis.core;

import com.joantolos.kata.tennis.domain.Luck;

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

    public void scoreRandomPoint() {
        Integer randomUserId = Luck.randomPointWinner();
        rawScore[randomUserId - 1] = rawScore[randomUserId - 1] + 1;
    }

    public void scorePoint(Integer playerId) {
        rawScore[playerId - 1] = rawScore[playerId - 1] + 1;
    }

    public String getScore() {
        return Score.calculate(rawScore[0], rawScore[1], playerOneName, playerTwoName);
    }

}