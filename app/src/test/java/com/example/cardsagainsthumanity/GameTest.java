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

    @Test
    public void canAddWhiteAnswerCard() {
        Game game = new Game(2);
        Card card = new Card("Donald Trump");

        game.addWhiteAnswerCard(card);
        assertEquals(1, game.getWhiteAnswerCards().size());
    }

    @Test
    public void canRemoveWhiteAnswerCard() {
        Game game = new Game(2);
        Card card1 = new Card("Donald Trump");
        Card card2 = new Card("Ross Melville");
        game.addWhiteAnswerCard(card1);
        game.addWhiteAnswerCard(card2);

        game.removeWhiteAnswerCard(card1);
        assertEquals(1, game.getWhiteAnswerCards().size());
    }

    @Test
    public void canSetDealer() {
        Game game = new Game(2);
        game.setDealer(1);
        assertEquals(1, game.getDealer());
    }

}

