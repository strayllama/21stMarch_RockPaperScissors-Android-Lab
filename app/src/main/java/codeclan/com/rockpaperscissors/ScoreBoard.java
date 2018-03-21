package codeclan.com.rockpaperscissors;

import android.content.Intent;

/**
 * Created by user on 21/03/2018.
 */

public class ScoreBoard {
    private static Integer playerScore = 0;
    private static Integer computerScore = 0;

    public ScoreBoard(){

    }

    public static String getPlayerScore(){
        return playerScore.toString();
    }

    public static String getComputerScore(){
        return computerScore.toString();
    }

    public static void addToPlayer() {
        playerScore += 1;
    }

    public static void addToComputer() {
        computerScore += 1;
    }

    public static void resetScoreboard() {
        playerScore = 0;
        computerScore = 0;
    }
}
