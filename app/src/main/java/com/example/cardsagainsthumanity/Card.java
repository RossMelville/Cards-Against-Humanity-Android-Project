package com.example.cardsagainsthumanity;

import java.io.Serializable;

/**
 * Created by rossmelville on 11/08/2017.
 */

public class Card implements Serializable{

    private String statement;

    public Card(String statement) {
        this.statement =  statement;
    }

    public String getStatement() {
        return this.statement;
    }

}
