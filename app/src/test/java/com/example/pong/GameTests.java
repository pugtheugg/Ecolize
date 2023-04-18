package com.example.pong;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTests {

    @Test
    public void pauseIsCorrect() {
        MainActivity myClass     = new MainActivity();
        boolean result      = myClass.pause();
        boolean expected    = true;
        assertEquals(expected, result);
    }

    @Test
    public void resumeIsCorrect() {
        MainActivity myClass     = new MainActivity();
        boolean result      = myClass.resume();
        boolean expected    = false;
        assertEquals(expected, result);
    }

    @Test
    public void scoreIsCorrect() {
        MainActivity myClass = new MainActivity();
        myClass.increaseScore();
        int result = myClass.getScore();
        int expected = 1; // Score starts at 0
        assertEquals(expected, result);
    }

}
