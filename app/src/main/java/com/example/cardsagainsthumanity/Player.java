package com.example.cardsagainsthumanity;

import java.util.ArrayList;

/**
 * Created by rossmelville on 12/08/2017.
 */

public class Player {
    private String name;
    public ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }


    public void populateHand(Deck deck) {
        for(int i = 1; i < 11; i++){
            Card card = deck.getRandomCard();
            deck.removeCard(card);
            hand.add(card);
        }
    }


    public void removeCard(Card card) {
        hand.remove(card);
    }

    public Card findByStatement(String famine) {
    }
}
