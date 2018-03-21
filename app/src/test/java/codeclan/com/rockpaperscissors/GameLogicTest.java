package codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/03/2018.
 */

public class GameLogicTest {
    private Game rpsGame;

    @Before
    public void before() {
        rpsGame = new Game(Hand.PAPER);
    }

//    @Test
//    public void gameHasComputerHand() {
//        assertEquals(Hand.PAPER, rpsGame.getComputerHand());
//    }

//    @Test
//    public void gameHasPlayerHand() {
//        assertEquals(Hand.PAPER, rpsGame.getPlayerHand());
//    }

    @Test
    public void gameGivesResult() { // Only true 1 in 3-ish.
        assertEquals("It's a draw, you both chose: PAPER", rpsGame.getWinner());
    }
}
