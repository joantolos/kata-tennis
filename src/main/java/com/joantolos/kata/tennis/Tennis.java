package com.joantolos.kata.tennis;

public class Tennis {

    private Integer[] rawScore;

    public Tennis(){
        newGame();
    }

    private void newGame() {
        this.rawScore = new Integer[2];
        this.rawScore[0] = 0;
        this.rawScore[1] = 0;
    }

    public void scorePoint(Integer playerId) {
        rawScore[playerId - 1] = rawScore[playerId - 1] + 1;
    }

    public String getPrettyScore() {
        String scoreLayout = "#1 - #2";
        String playerOnePrettyScore = "";
        String playerTwoPrettyScore = "";

        if (rawScore[0] == 1 && rawScore[1] == 0){
            playerOnePrettyScore = "Fifteen";
            playerTwoPrettyScore = "Love";
        }
        return scoreLayout
                .replace("#1", playerOnePrettyScore)
                .replace("#2", playerTwoPrettyScore);
    }
}
