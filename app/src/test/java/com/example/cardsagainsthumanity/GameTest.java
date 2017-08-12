package com.example.cardsagainsthumanity;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by rossmelville on 12/08/2017.
 */

public class GameTest {

    @Test
    public void canAddPlayer() {
        Game game = new Game(2);
        Player player1 = new Player("Ross");
        Player player2 =  new Player("Victoria");
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.getPlayers().size());
    }

    @Test
    public void canAddCardToBlackDeck() {
        Game game = new Game(1);
        Card card = new Card("Poor life choices.");
        game.addToBlackDeck(card);
        assertEquals(1, game.getBlackDeck().size());
    }
}
