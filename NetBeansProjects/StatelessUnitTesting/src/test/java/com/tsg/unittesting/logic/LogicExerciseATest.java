/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jose
 */
public class LogicExerciseATest {

    public LogicExerciseATest() {
    }

    @Test
    public void hiTest() {
        String hi = LogicExerciseA.friendlyGreeting("Gerald", false);

        assertEquals(hi, "hi");
    }

    @Test
    public void helloTest() {
        String hello = LogicExerciseA.friendlyGreeting("Gerald", true);

        assertEquals(hello, "Hello, Gerald!");
    }

    @Test
    public void quiet() {
        String quiet = LogicExerciseA.friendlyGreeting(null , false);

        assertEquals(quiet, "...");
    }
    
    @Test
    public void quietEmptyString() {
        String empty = LogicExerciseA.friendlyGreeting("" , false);

        assertEquals(empty, "...");
    }
}
