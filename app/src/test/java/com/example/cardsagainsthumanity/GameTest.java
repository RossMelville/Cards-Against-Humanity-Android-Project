package com.example.cardsagainsthumanity;

import org.junit.Test;

import java.util.ArrayList;

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
    public void canSetTurn() {
        Game game = new Game(2);
        game.setTurn(1);
        assertEquals(1, game.getTurn());
    }

    @Test
    public void canAllocatePointToCorrectPlayer() {
        Game game = new Game(3);
        Player player1 = new Player("Ross");
        Player player2 = new Player("Victoria");
        Player player3 = new Player("Steve");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.addPoint(player2);
        int result = game.getPlayerPoints(player2);
        assertEquals(1, result);
    }

    @Test
    public void canPopulateBlackStatementCards() {
        Game game = new Game(2);
        game.blackDeck.addCard(new Card("During sex, I like to think about________."));
        game.blackDeck.addCard(new Card("World War 3 will be started because________."));
        game.blackDeck.addCard(new Card("Growing a pair."));
        game.blackDeck.addCard(new Card("Famine"));
        game.blackDeck.addCard(new Card("Flesh-eating bacteria."));
        game.blackDeck.addCard(new Card("Flying sex snakes."));
        game.blackDeck.addCard(new Card("Not giving a shit about the Third World."));
        game.blackDeck.addCard(new Card("A man on the brink of Orgasm"));
        game.blackDeck.addCard(new Card("Shapeshifters."));

        game.populateBlackStatementCards();
        assertEquals(2, game.getBlackStatementCards().size());
        assertEquals(7, game.blackDeck.size());
    }

    @Test
    public void canSetDealerIndex() {
        Game game = new Game(2);
        game.setDealerIndex(1);
        assertEquals(1, game.dealerIndex);
    }

}

