# Kata Tennis

Implementation of the original kata from Code Dojo.

To run the build with test coverage:

    ./gradlew clean build jacocoTestReport
    
You will find the coverage report on _kata-tennis/build/jacoco/reports/coverage/html/index.html_

You can run the Tennis class on your IDE or by console:

    ./gradlew fatJar
    java -jar build/libs/kata-tennis-all-1.0.jar

## Instructions

This Kata is about implementing a simple tennis game. I came up with it while thinking about Wii tennis, where they have simplified tennis, so each set is one game.

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

1. If you have 40 and you win the ball you win the game, however there are special rules.

1. If both have 40 the players are deuce. 
    1. If the game is in deuce, the winner of a ball will have advantage and game ball. 
    1. If the player with advantage wins the ball he wins the game 
    1. If the player without advantage wins they are back at deuce.

1. A game is won by the first player to have won at least four points in total and at least two points more than the opponent.

1. The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as “love”, “fifteen”, “thirty”, and “forty” respectively.

1. If at least three points have been scored by each player, and the scores are equal, the score is “deuce”.

1. If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is “advantage” for the player in the lead.

