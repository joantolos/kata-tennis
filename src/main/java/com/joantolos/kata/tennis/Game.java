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

        score.setPlayerOne(playerOne);
        score.setPlayerTwo(playerTwo);

        if (playerOne.getPoint().equals(playerTwo.getPoint())){
            setDeuce(playerOne);
        } else if(playerOne.getPoint() >=4 || playerTwo.getPoint()>=4) {
            setWin(playerOne, playerTwo);
        }

        return score.prettify();
    }

    private void setWin(ScoreNames playerOne, ScoreNames playerTwo) {
        Integer winnerPoints = Math.max(playerOne.getPoint(), playerTwo.getPoint());
        if(Math.abs(playerOne.getPoint() - playerTwo.getPoint()) != 1) {
            if (playerOne.getPoint().equals(winnerPoints)) {
                score.setPlayerOne(ScoreNames.PLAYER_1_WIN);
                score.setPlayerTwo(ScoreNames.PLAYER_1_WIN);
            } else {
                score.setPlayerOne(ScoreNames.PLAYER_2_WIN);
                score.setPlayerTwo(ScoreNames.PLAYER_2_WIN);
            }
        } else {
            if (playerOne.getPoint().equals(winnerPoints)) {
                score.setPlayerOne(ScoreNames.PLAYER_1_ADVANTAGE);
                score.setPlayerTwo(ScoreNames.PLAYER_1_ADVANTAGE);
            } else {
                score.setPlayerOne(ScoreNames.PLAYER_2_ADVANTAGE);
                score.setPlayerTwo(ScoreNames.PLAYER_2_ADVANTAGE);
            }
        }
    }

    private void setDeuce(ScoreNames playerOne) {
        score.setPlayerOne(ScoreNames.DEUCE);
        score.setPlayerTwo(ScoreNames.DEUCE);
        if(playerOne.getPoint() < 3) {
            score.setPlayerOne(playerOne);
            score.setPlayerTwo(ScoreNames.ALL);
        }
    }

}
