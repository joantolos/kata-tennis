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
        if (score.getRaw()[0] == 1 && score.getRaw()[1] == 0){
            score.setPlayerOne("Fifteen");
            score.setPlayerTwo("Love");
        }
        return score.getPlayerOne() + " - " + score.getPlayerTwo();
    }

}
