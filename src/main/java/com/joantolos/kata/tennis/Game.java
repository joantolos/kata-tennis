package com.joantolos.kata.tennis;

public class Game {

    private Integer[] raw;
    private Score playerOne;
    private Score playerTwo;

    public Game() {
        this.raw = new Integer[2];
        this.raw[0] = 0;
        this.raw[1] = 0;
    }

    public void scorePoint(Integer playerId) {
        raw[playerId - 1] = raw[playerId - 1] + 1;
    }

    public String getScore() {
        Score playerOne = Score.getByPoint(raw[0]);
        Score playerTwo = Score.getByPoint(raw[1]);
        Integer playerOnePoint = playerOne.getPoint();
        Integer playerTwoPoint = playerTwo.getPoint();

        setScores(playerOne, playerTwo);

        if (playerOnePoint.equals(playerTwoPoint)){
            setScores(Score.DEUCE, Score.DEUCE);
            if(playerOnePoint < 3) {
                setScores(playerOne, Score.ALL);
            }
        } else {
            if((playerOnePoint >= 4 || playerTwoPoint >= 4) && (!((playerOnePoint >= 4 || playerTwoPoint >= 4) && (Math.abs(playerOnePoint - playerTwoPoint) != 1)))) {
                Integer maxPoint = Math.max(playerOnePoint, playerTwoPoint);
                if (playerOnePoint.equals(maxPoint)) {
                    setScores(Score.PLAYER_1_ADVANTAGE, Score.PLAYER_1_ADVANTAGE);
                } else {
                    setScores(Score.PLAYER_2_ADVANTAGE, Score.PLAYER_2_ADVANTAGE);
                }
            }
            if((playerOnePoint >= 4 || playerTwoPoint >= 4) && (Math.abs(playerOnePoint - playerTwoPoint) != 1)) {
                Integer maxPoint = Math.max(playerOnePoint, playerTwoPoint);
                if (playerOnePoint.equals(maxPoint)) {
                    setScores(Score.PLAYER_1_WIN, Score.PLAYER_1_WIN);
                } else {
                    setScores(Score.PLAYER_2_WIN, Score.PLAYER_2_WIN);
                }
            }
        }

        return prettify();
    }

    private void setScores(Score playerOne, Score playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private String prettify() {
        if(playerOne.equals(playerTwo)) return playerOne.getName();
        return playerOne.getName() + " - " + playerTwo.getName();
    }
}
