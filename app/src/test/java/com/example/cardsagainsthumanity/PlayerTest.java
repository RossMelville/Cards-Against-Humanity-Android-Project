package com.example.cardsagainsthumanity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by rossmelville on 12/08/2017.
 */

public class PlayerTest {

    @Test
    public void canGetName(){
        Player player1 = new Player("Ross");
        assertEquals("Ross", player1.getName());
    }
}
