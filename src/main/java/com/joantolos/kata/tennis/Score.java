package com.joantolos.kata.tennis;

import java.util.Arrays;

public enum Score {

    DEFAULT_0(0, "Love"),
    DEFAULT_1(1, "Fifteen"),
    DEFAULT_2(2, "Thirty"),
    DEFAULT_3(3, "Forty"),
    DEFAULT_4(4, "-1"),
    DEFAULT_5(5, "-1"),
    DEFAULT_6(6, "-1"),

    ALL(-1, "All"),
    DEUCE(-1, "Deuce"),
    PLAYER_1_WIN(-1, "Win for player 1"),
    PLAYER_2_WIN(-1, "Win for player 2"),
    PLAYER_1_ADVANTAGE(-1, "Advantage player 1"),
    PLAYER_2_ADVANTAGE(-1, "Advantage player 2");

    private Integer point;
    private String name;

    Score(Integer point, String name){
        this.point = point;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPoint() {
        return point;
    }

    public static Score getByPoint(Integer targetPoint){
        return Arrays.stream(Score.values())
                .filter(score -> score.point.equals(targetPoint))
                .findFirst()
                .orElse(null);
    }
}
