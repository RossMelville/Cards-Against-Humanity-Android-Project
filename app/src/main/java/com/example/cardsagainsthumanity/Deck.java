package com.example.cardsagainsthumanity;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Created by rossmelville on 11/08/2017.
 */

public class Deck implements Serializable{

    public ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();

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

    public int size() {
        return deck.size();
    }
}
