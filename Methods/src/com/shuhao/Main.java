package com.shuhao;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int hightscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("your final score was " + hightscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        hightscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("your final score was " + hightscore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition (String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if ( playerScore >= 500){
            return 2;
        } else if (playerScore >= 100){
            return 3;
        }

        return 4;
    }

}
