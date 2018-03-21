package codeclan.com.rockpaperscissors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by user on 21/03/2018.
 */

public class Game {

    private Hand playerHand;
    private Hand computerHand;

    public Game(Hand playerHand) {
        this.playerHand = playerHand;
        this.setComputerHand();
    }


    // SETTER
    private void setComputerHand() {
        Random rand = new Random();
        int compChoice = rand.nextInt((Hand.values().length));
        computerHand = Hand.values()[compChoice];
    }

    // OTHER
    public String getWinner() {
        HashMap<String , String> win = new HashMap<>();
        win.put("rock", "scissors");
        win.put("scissors" ,"paper");
        win.put("paper" , "rock");

        String player = playerHand.toString().toLowerCase();
        String comp = computerHand.toString().toLowerCase();

        String result = "";
        if (player.equals(comp)) {
            result = ("It's a draw, the computer chose " + comp + " aswell!");
        } else if (win.get(player).equals(comp)) {
            result = ("Player won! Your " + player + " beats computers " + comp);
            ScoreBoard.addToPlayer();
        } else if (win.get(comp).equals(player)) {
            result = ("Computer won! Its " + comp + " beats your " + player);
            ScoreBoard.addToComputer();
        } else { result = "wrong logic in code! 011010101"; }

        return result;
    }

}
