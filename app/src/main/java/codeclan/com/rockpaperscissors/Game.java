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
            result = ("It's a draw, you both chose: " + comp + player);
        } else if (win.get(player).equals(comp)) {
            result = ("Player won! " + player + " beats " + comp);
        } else if (win.get(comp).equals(player)) {
            result = ("Computer won! " + comp + " beats " + player);
        } else { result = "wrong logic in code! 011010101"; }

        return result;
    }

}
