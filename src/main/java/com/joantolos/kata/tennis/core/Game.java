package com.joantolos.kata.tennis.core;

import com.joantolos.kata.tennis.domain.Luck;

public class Game {

    private Integer[] rawScore;
    private String playerOneName;
    private String playerTwoName;
    private UserInterface ui;

    public Game(UserInterface ui, String playerOneName, String playerTwoName) {
        this.ui = ui;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.rawScore = new Integer[2];
        this.rawScore[0] = 0;
        this.rawScore[1] = 0;
    }

    public Integer scoreRandomPoint() {
        Integer randomUserId = Luck.randomPointWinner();
        rawScore[randomUserId - 1] = rawScore[randomUserId - 1] + 1;
        return randomUserId;
    }

    public void scorePoint(Integer playerId) {
        rawScore[playerId - 1] = rawScore[playerId - 1] + 1;
    }

    public String getScore() {
        return Score.calculate(rawScore[0], rawScore[1], playerOneName, playerTwoName);
    }

    public void start() {
        do {
            Integer winnerPointPlayerId = scoreRandomPoint();
            if (winnerPointPlayerId == 1) {
                ui.print("Point " + playerOneName);
            } else {
                ui.print("Point " + playerTwoName);
            }
            ui.print("Score: " + getScore());
        } while (!getScore().startsWith("Win"));
    }
}