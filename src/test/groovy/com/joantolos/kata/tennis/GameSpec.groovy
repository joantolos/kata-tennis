package com.joantolos.kata.tennis

import com.joantolos.kata.tennis.core.Game
import com.joantolos.kata.tennis.core.UserInterface
import spock.lang.Specification

class GameSpec extends Specification {

    def 'Should score point'(){
        given: "A new game"
        Game game = new Game(new UserInterface(),"Joan", "Finner")

        when: "Joan scores"
        game.scorePoint(1)

        then: "Score should match"
        game.getScore() == "Fifteen - Love"
    }

    def 'Should score point to a random user'(){
        given: "A new game"
        Game game = new Game(new UserInterface(),"Joan", "Finner")

        when: "Joan scores"
        game.scoreRandomPoint()

        then: "Score should match"
        game.getScore() == "Fifteen - Love" || game.getScore() == "Love - Fifteen"
    }

    def 'Should start game'(){
        given: "A new game"
        Game game = new Game(new UserInterface(),"Joan", "Finner")

        expect:
        game.start()
    }
}
