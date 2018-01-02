package com.joantolos.kata.tennis;

public class ScoreName {

    private static String[] defaults = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    public static String WIN = "Win for #playerName";
    public static String ADVANTATGE = "Advantage #playerName";

    public static String getDefault(Integer point){
        return defaults[point];
    }
}
