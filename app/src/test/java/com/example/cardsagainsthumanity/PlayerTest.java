package com.example.cardsagainsthumanity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by rossmelville on 12/08/2017.
 */

public class PlayerTest {

    @Test
    public void canGetName(){
        Player player1 = new Player("Ross");
        assertEquals("Ross", player1.getName());
    }

    @Test
    public void canAddCardToHand() {
        Player player1 = new Player("Ross");
        Card card = new Card("Poor life choices.");
        player1.addCard(card);
        assertEquals(1, player1.getHand().size());

    }

    @Test
    public void canPopulateHand() {
        Player player1 = new Player("Ross");
        Deck deck = new Deck();
        deck.addCard(new Card("Poor life choices."));
        deck.addCard(new Card("Bogies."));
        deck.addCard(new Card("Lumberjack fantasies."));
        deck.addCard(new Card("Waking up half-naked in a Little Chef car park."));
        deck.addCard(new Card("Tories."));
        deck.addCard(new Card("The unstoppable tide of Islam."));
        deck.addCard(new Card("Growing a pair."));
        deck.addCard(new Card("Famine"));
        deck.addCard(new Card("Flesh-eating bacteria."));
        deck.addCard(new Card("Flying sex snakes."));
        deck.addCard(new Card("Not giving a shit about the Third World."));
        deck.addCard(new Card("A man on the brink of Orgasm"));
        deck.addCard(new Card("Shapeshifters."));
        player1.populateHand(deck);
        assertEquals(10, player1.getHand().size());
        assertEquals(3, deck.getDeck().size());

    }
}
