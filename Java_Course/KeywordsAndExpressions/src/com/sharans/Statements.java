package com.sharans;

public class Statements {
    public static void main(String[] args) {
        //Statements, Whitespace, and indenting
        boolean gameOver = true;
        int score = 5001;
        int levelC = 5;
        int bonus = 100;
        calculateScore(gameOver,score,levelC,bonus);
        calculateScore(true,2852,9,300);
    }
    public static int calculateScore(boolean gameOver, int score, int levelC, int bonus) {
        if (gameOver) {
            int finalscore = score + (levelC * bonus);
            System.out.println("Score was " + finalscore);
            return finalscore;
        }
        return -1;
    }
}
