package com.joantolos.kata.tennis

import spock.lang.Specification

class LuckSpec extends Specification {

    def 'Should randomly decide between player one and two to win the point'() {
        given:
        Integer pointWinnerUserId = Luck.randomPointWinner()

        expect:
        pointWinnerUserId == 0 || pointWinnerUserId == 1
    }
}
