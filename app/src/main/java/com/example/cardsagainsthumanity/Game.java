package com.example.cardsagainsthumanity;

import java.util.ArrayList;

/**
 * Created by rossmelville on 12/08/2017.
 */

public class Game {
    private ArrayList<Player> players;
    private Deck blackDeck;
    private Deck whiteDeck;
    private ArrayList<Card> blackStatementCards;
    private ArrayList<Card> whiteAnswerCards;
    private int dealer;
    private int[] points;

    public Game(int numberOfPlayers) {
        this.players = new ArrayList<Player>();
        this.blackDeck = new Deck();
        this.whiteDeck = new Deck();
        this.blackStatementCards = new ArrayList<Card>();
        this.whiteAnswerCards = new ArrayList<Card>();
        this.dealer = 0;
        this.points = new int[numberOfPlayers];
    }


    public void addPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addBlackStatementCard(Card card) {
        blackStatementCards.add(card);
    }

    public ArrayList<Card> getBlackStatementCards() {
        return blackStatementCards;
    }

    public void removeBlackStatementCards(Card card) {
        blackStatementCards.remove(card);
    }

    public ArrayList<Card> getWhiteAnswerCards() {
        return whiteAnswerCards;
    }


    public void addWhiteAnswerCard(Card card) {
        whiteAnswerCards.add(card);
    }

    public void removeWhiteAnswerCard(Card card) {
        whiteAnswerCards.remove(card);
    }

    public int getDealer() {
        return dealer;
    }

    public void setDealer(int dealer) {
        this.dealer = dealer;
    }

    public int[] getPoints() {
        return points;
    }
}
