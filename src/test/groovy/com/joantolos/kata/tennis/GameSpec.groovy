package com.joantolos.kata.tennis

import spock.lang.Specification

class GameSpec extends Specification {

    def 'Should pretty print every score combination'() {

        given: "A new game"
        Game game = new Game()

        expect: 'Should match the expected pretty score'
        playerOneScore.times{game.scorePoint(1)}
        playerTwoScore.times{game.scorePoint(2)}
        game.getScore() == expectedPrettyScore

        where:
        playerOneScore  | playerTwoScore    | expectedPrettyScore
//        0 				| 0 				|| "Love - All"
//        1 				| 1 				|| "Fifteen - All"
//        2 				| 2 				|| "Thirty - All"
//        3 				| 3 				|| "Deuce"
//        4 				| 4 				|| "Deuce"
        1 				| 0 				|| "Fifteen - Love"
        0 				| 1 				|| "Love - Fifteen"
        2 				| 0 				|| "Thirty - Love"
        0 				| 2 				|| "Love - Thirty"
        3 				| 0 				|| "Forty - Love"
        0 				| 3 				|| "Love - Forty"
//        4 				| 0 				|| "Win for player 1"
//        0 				| 4 				|| "Win for player 2"
        2 				| 1 				|| "Thirty - Fifteen"
        1 				| 2 				|| "Fifteen - Thirty"
        3 				| 1 				|| "Forty - Fifteen"
        1 				| 3 				|| "Fifteen - Forty"
//        4 				| 1 				|| "Win for player 1"
//        1 				| 4 				|| "Win for player 2"
        3 				| 2 				|| "Forty - Thirty"
        2 				| 3 				|| "Thirty - Forty"
//        4 				| 2 				|| "Win for player 1"
//        2 				| 4 				|| "Win for player 2"
//        4 				| 3 				|| "Advantage player 1"
//        3 				| 4 				|| "Advantage player 2"
//        5 				| 4 				|| "Advantage player 1"
//        4 				| 5 				|| "Advantage player 2"
//        6 				| 4 				|| "Win for player 1"
//        4 				| 6 				|| "Win for player 2"
    }
}
