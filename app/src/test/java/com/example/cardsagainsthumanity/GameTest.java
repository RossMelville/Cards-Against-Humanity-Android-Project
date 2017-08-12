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
        Card card = new Card("During sex I think about _________.");

        game.addBlackStatementCard(card);
        assertEquals(1, game.getBlackStatementCards().size());
    }

    @Test
    public void canRemoveBlackStatementCards() {
        Game game = new Game(2);
        Card card = new Card("During sex I think about _________.");
        Card card2 = new Card("I drink to forget __________.");
        game.addBlackStatementCard(card);
        game.addBlackStatementCard(card2);

        game.removeBlackStatementCards(card);
        assertEquals(1, game.getBlackStatementCards().size());
    }
}
