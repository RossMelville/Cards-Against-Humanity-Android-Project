package com.example.cardsagainsthumanity;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rossmelville on 11/08/2017.
 */

public class Deck {

    private ArrayList<Card> deck;
    private Random randomGenerator;

    public Deck() {
        deck = new ArrayList<Card>();
        randomGenerator = new Random();
    }

    public ArrayList<Card> getDeck() {
        return new ArrayList<Card>(deck);
    }


    public void addCard(Card card) {
        deck.add(card);
    }

    public void removeCard(Card card) {
        deck.remove(card);
    }

    public Card getRandomCard() {
        int index = (int)(Math.random() * deck.size());
        Card card = deck.get(index);
        return card;
    }
}
