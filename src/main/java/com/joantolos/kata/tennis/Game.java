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
        Integer[] rawScore = score.getRaw();
        if (rawScore[0] == 1 && rawScore[1] == 0){
            score.setPlayerOne("Fifteen");
            score.setPlayerTwo("Love");
        }
        if (Objects.equals(rawScore[0], rawScore[1])){
            score.setPlayerOne("Deuce");
            score.setPlayerTwo("Deuce");
        }

        return score.prettify();
    }

}
