package com.example.cardsagainsthumanity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by rossmelville on 11/08/2017.
 */

public class DeckTest {

    @Test
    public void canGetDeck() {
        Deck deck = new Deck();
        assertEquals(3, deck.getDeck().size());
    }

    @Test
    public void canAddToDeck() {
        Deck deck = new Deck();
        Card card = new Card("Madonna");
        deck.addCard(card);
        assertEquals(4, deck.getDeck().size());
    }

    
}
