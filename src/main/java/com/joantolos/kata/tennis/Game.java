package com.joantolos.kata.tennis;

import com.joantolos.kata.tennis.domain.Score;

import java.util.Objects;

public class Game {

    private Score score;

    public Game(){
        this.score = new Score();
    }

    public void scorePoint(Integer playerId) {
        score.getRaw()[playerId - 1] = score.getRaw()[playerId - 1] + 1;
    }

    public String getPrettyScore() {
        Integer playerOne = score.getRaw()[0];
        Integer playerTwo = score.getRaw()[1];

        if (playerOne == 1 && playerTwo == 0){
            score.setPlayerOne("Fifteen");
            score.setPlayerTwo("Love");
        }
        if (Objects.equals(playerOne, playerTwo)){
            score.setPlayerOne("Deuce");
            score.setPlayerTwo("Deuce");
        }

        return score.prettify();
    }

}
