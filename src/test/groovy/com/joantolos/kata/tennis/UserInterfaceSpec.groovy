package com.joantolos.kata.tennis

import com.joantolos.kata.tennis.core.UserInterface
import spock.lang.Specification

class UserInterfaceSpec extends Specification {

    UserInterface ui

    def setup() {
        ui = new UserInterface()
    }

    def "User Interface should print prompt"(){
        expect:
        ui.prompt()
    }

    def "User Interface should print exit"(){
        expect:
        ui.exit()
    }

    def "User Interface should print random text"(){
        expect:
        ui.print("Random text")
    }
}
