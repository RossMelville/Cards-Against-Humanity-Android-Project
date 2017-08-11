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
        assertEquals(0, deck.getDeck().size());
    }

    @Test
    public void canAddToDeck() {
        Deck deck = new Deck();
        Card card = new Card("Madonna");
        deck.addCard(card);
        assertEquals(1, deck.getDeck().size());
    }

    @Test
    public void canRemoveFromDeck() {
        Deck deck = new Deck();
        Card card = new Card("Donald Trump");
        deck.addCard(card);
        deck.removeCard(card);
        assertEquals(0, deck.getDeck().size());
    }
}
