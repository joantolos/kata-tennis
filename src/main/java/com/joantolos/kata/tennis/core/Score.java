package com.joantolos.kata.tennis.core;

import java.util.Objects;

public class Score {

    private static final String[] defaults = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    private static final String WIN = "Win for #playerName";
    private static final String ADVANTAGE = "Advantage #playerName";
    private static final String DEUCE = "Deuce";
    private static final String ALL = "All";

    public static String calculate(Integer playerOnePoint, Integer playerTwoPoint, String playerOneName, String playerTwoName){
        if(Objects.equals(playerOnePoint, playerTwoPoint)) return deuce(playerOnePoint);
        if(playerOnePoint > 3 || playerTwoPoint > 3) return winOrTie(playerOnePoint, playerTwoPoint, playerOneName, playerTwoName);
        return defaultScore(playerOnePoint, playerTwoPoint);
    }

    private static String deuce(Integer playerOnePoint) {
        if(playerOnePoint < 3) return defaults[playerOnePoint] + " - " + ALL;
        return DEUCE;
    }

    private static String winOrTie(Integer playerOnePoint, Integer playerTwoPoint, String playerOneName, String playerTwoName) {
        if(Math.abs(playerOnePoint - playerTwoPoint) >= 2) return win(playerOnePoint, playerTwoPoint, playerOneName, playerTwoName);
        return tie(playerOnePoint, playerTwoPoint, playerOneName, playerTwoName);
    }

    private static String win(Integer playerOnePoint, Integer playerTwoPoint, String playerOneName, String playerTwoName) {
        if(playerOnePoint>playerTwoPoint) return WIN.replace("#playerName", playerOneName);
        return WIN.replace("#playerName", playerTwoName);
    }

    private static String tie(Integer playerOnePoint, Integer playerTwoPoint, String playerOneName, String playerTwoName) {
        if(playerOnePoint>playerTwoPoint) return ADVANTAGE.replace("#playerName", playerOneName);
        return ADVANTAGE.replace("#playerName", playerTwoName);
    }

    private static String defaultScore(Integer playerOnePoint, Integer playerTwoPoint) {
        return defaults[playerOnePoint] + " - " + defaults[playerTwoPoint];
    }
}
