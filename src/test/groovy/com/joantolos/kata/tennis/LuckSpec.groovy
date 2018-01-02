package com.joantolos.kata.tennis

import com.joantolos.kata.tennis.domain.Luck
import spock.lang.Specification

class LuckSpec extends Specification {

    def 'Should randomly decide between player one or two winning the point'() {
        given:
        Integer pointWinnerUserId = Luck.randomPointWinner()

        expect:
        pointWinnerUserId == 1 || pointWinnerUserId == 2
    }
}
