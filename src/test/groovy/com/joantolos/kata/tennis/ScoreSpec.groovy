package com.joantolos.kata.tennis

import com.joantolos.kata.tennis.core.Game
import spock.lang.Specification

class ScoreSpec extends Specification {

    def 'Should pretty print every score combination'() {

        given: "A new game"
        Game game = new Game("Joan", "Finner")

        expect: 'Should match the expected pretty rawScore'
        playerOneScore.times{game.scorePoint(1)}
        playerTwoScore.times{game.scorePoint(2)}
        game.getScore() == expectedPrettyScore

        where:
        playerOneScore  | playerTwoScore    | expectedPrettyScore
        0 				| 0 				|| "Love - All"
        1 				| 1 				|| "Fifteen - All"
        2 				| 2 				|| "Thirty - All"
        3 				| 3 				|| "Deuce"
        4 				| 4 				|| "Deuce"
        1 				| 0 				|| "Fifteen - Love"
        0 				| 1 				|| "Love - Fifteen"
        2 				| 0 				|| "Thirty - Love"
        0 				| 2 				|| "Love - Thirty"
        3 				| 0 				|| "Forty - Love"
        0 				| 3 				|| "Love - Forty"
        4 				| 0 				|| "Win for Joan"
        0 				| 4 				|| "Win for Finner"
        2 				| 1 				|| "Thirty - Fifteen"
        1 				| 2 				|| "Fifteen - Thirty"
        3 				| 1 				|| "Forty - Fifteen"
        1 				| 3 				|| "Fifteen - Forty"
        4 				| 1 				|| "Win for Joan"
        1 				| 4 				|| "Win for Finner"
        3 				| 2 				|| "Forty - Thirty"
        2 				| 3 				|| "Thirty - Forty"
        4 				| 2 				|| "Win for Joan"
        2 				| 4 				|| "Win for Finner"
        4 				| 3 				|| "Advantage Joan"
        3 				| 4 				|| "Advantage Finner"
        5 				| 4 				|| "Advantage Joan"
        4 				| 5 				|| "Advantage Finner"
        6 				| 4 				|| "Win for Joan"
        4 				| 6 				|| "Win for Finner"
    }
}
