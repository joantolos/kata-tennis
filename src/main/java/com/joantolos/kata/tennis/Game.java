package com.joantolos.kata.tennis;

import com.joantolos.kata.tennis.domain.Score;

public class Game {

    private Score score;

    public Game(){
        this.score = new Score();
    }

    public void scorePoint(Integer playerId) {
        score.getRaw()[playerId - 1] = score.getRaw()[playerId - 1] + 1;
    }

    public String getPrettyScore() {
        ScoreNames playerOne = ScoreNames.getByPoint(score.getRaw()[0]);
        ScoreNames playerTwo = ScoreNames.getByPoint(score.getRaw()[1]);
        setScores(playerOne, playerTwo);

        if (isDeuce(playerOne, playerTwo)){
            setScores(ScoreNames.DEUCE, ScoreNames.DEUCE);
            if(playerOne.getPoint() < 3) {
                setScores(playerOne, ScoreNames.ALL);
            }
        } else {
            if(isTie(playerOne, playerTwo)) {
                if (playerOneHasMaxPoint(playerOne, playerTwo)) {
                    setScores(ScoreNames.PLAYER_1_ADVANTAGE, ScoreNames.PLAYER_1_ADVANTAGE);
                } else {
                    setScores(ScoreNames.PLAYER_2_ADVANTAGE, ScoreNames.PLAYER_2_ADVANTAGE);
                }
            }
            if(isWin(playerOne, playerTwo)) {
                if (playerOneHasMaxPoint(playerOne, playerTwo)) {
                    setScores(ScoreNames.PLAYER_1_WIN, ScoreNames.PLAYER_1_WIN);
                } else {
                    setScores(ScoreNames.PLAYER_2_WIN, ScoreNames.PLAYER_2_WIN);
                }
            }
        }

        return score.prettify();
    }

    private boolean playerOneHasMaxPoint(ScoreNames playerOne, ScoreNames playerTwo) {
        Integer maxPoint = Math.max(playerOne.getPoint(), playerTwo.getPoint());
        return playerOne.getPoint().equals(maxPoint);
    }

    private boolean isWin(ScoreNames playerOne, ScoreNames playerTwo) {
        return pointIsFourOrMore(playerOne, playerTwo) && (Math.abs(playerOne.getPoint() - playerTwo.getPoint()) != 1);
    }

    private boolean pointIsFourOrMore(ScoreNames playerOne, ScoreNames playerTwo) {
        return playerOne.getPoint() >=4 || playerTwo.getPoint()>=4;
    }

    private boolean isTie(ScoreNames playerOne, ScoreNames playerTwo) {
        return pointIsFourOrMore(playerOne, playerTwo) && (!isWin(playerOne, playerTwo));
    }

    private boolean isDeuce(ScoreNames playerOne, ScoreNames playerTwo) {
        return playerOne.getPoint().equals(playerTwo.getPoint());
    }

    private void setScores(ScoreNames playerOne, ScoreNames playerTwo) {
        score.setPlayerOne(playerOne);
        score.setPlayerTwo(playerTwo);
    }

}
