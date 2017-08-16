package com.example.cardsagainsthumanity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by rossmelville on 12/08/2017.
 */

public class Game implements Serializable{

    public ArrayList<Player> players;
    public Deck blackDeck;
    public Deck whiteDeck;
    public ArrayList<Card> blackStatementCards;
    public ArrayList<Card> whiteAnswerCards;
    private int dealer;
    public int[] points;
    public int playerTracker;

    public Game(int numberOfPlayers) {
        this.players = new ArrayList<Player>();
        this.blackDeck = new Deck();
        this.whiteDeck = new Deck();
        this.blackStatementCards = new ArrayList<Card>();
        this.whiteAnswerCards = new ArrayList<Card>();
        this.dealer = 0;
        this.points = new int[numberOfPlayers];
        this.playerTracker = 0;

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

    public void addPoint(Player player) {
        int index = 0;
        for(int i = 0; i < players.size(); ++i) {
            if(players.get(i) == player) index = i;
        }
        points[index] += 1;
    }

    public int getPlayerPoints(Player player) {
        int index = 0;
        for(int i = 0; i < players.size(); ++i) {
            if (players.get(i) == player) index = i;
        }
        return points[index];
    }

    public void populateBlackStatementCards() {
        for(int i = 1; i < 3; i++){
            Card card = blackDeck.getRandomCard();
            blackDeck.removeCard(card);
            blackStatementCards.add(card);
        }
    }




}
