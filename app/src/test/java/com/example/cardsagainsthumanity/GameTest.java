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
    public void canAddCardToBlackStatementCards() {
        Game game = new Game(2);
        Card card = new Card("During sex I thing about _________.");

        game.addBlackCard(card);
        assertEquals(1, game.getBlackStatementCards().size());
    }
}
