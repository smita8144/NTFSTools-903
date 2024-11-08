package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {

    
    @Test
    public void shouldAnswerWithTrue() {
        App app=new App();
        int expected=300;
        int actual=app.sum(100, 200);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAnswerWithNegatives() {
        App app=new App();
        int expected=-300;
        int actual=app.sum(-100, -200);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAnswerWithMixedValues() {
        App app=new App();
        int expected=100;
        int actual=app.sum(-100, 200);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAnswerWithZero() {
        App app=new App();
        int expected=0;
        int actual=app.sum(0, 0);
        assertEquals(expected,actual);
    }
   
}