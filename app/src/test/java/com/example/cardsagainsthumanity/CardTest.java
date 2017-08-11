package com.example.cardsagainsthumanity;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by rossmelville on 11/08/2017.
 */

public class CardTest {

    @Test
    public void canReturnStatement() {
        Card card = new Card("Pulling out");
        assertEquals("Pulling out", card.getStatement());
    }
}
