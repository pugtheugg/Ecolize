package com.example.pong;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTests {

    @Test
    public void ShouldReduceHealth() throws Exception {
        MainActivity myClass = new MainActivity();
        int originalHealth = myClass.getHealth();
        myClass.reduceHealth();
        int result = myClass.getHealth();
        assertEquals(originalHealth - 1, myClass.getHealth());
    }


    @Test
    public void HealthResetAfterRestart() {
        MainActivity myClass = new MainActivity();
        int health = myClass.getHealth();
        myClass.reduceHealth();
        myClass.restart();
        assertEquals(health, myClass.getHealth());
    }


    @Test
    public void ScoreResetAfterRestart() {
        MainActivity myClass = new MainActivity();
        int score = myClass.getScore();
        myClass.increaseScore();
        myClass.restart();
        assertEquals(score, myClass.getScore());
    }
}
