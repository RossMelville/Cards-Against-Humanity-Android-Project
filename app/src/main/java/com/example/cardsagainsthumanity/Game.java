package com.example.cardsagainsthumanity;

import java.util.ArrayList;

/**
 * Created by rossmelville on 12/08/2017.
 */

public class Game {
    private ArrayList<Player> players;
    private Deck blackDeck;
    private Deck whiteDeck;
    private ArrayList<Card> statementCards;
    private ArrayList<Card> answerCards;
    private int dealer;
    private int [] points;

    public Game(int numberOfPlayers) {
        players = new ArrayList<Player>();
        blackDeck = new Deck();
        whiteDeck = new Deck();
        statementCards = new ArrayList<Card>();
        answerCards = new ArrayList<Card>();
        dealer = 0;
        points = new int[numberOfPlayers];
    }


    public void addPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
