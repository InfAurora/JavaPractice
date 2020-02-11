/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jose
 */
public class StringsExerciseATest {

    @Test
    public void testAllLower() {
        String result = StringsExerciseA.yell("ack");
        assertEquals(result, "ACK");
    }
    
    @Test
    public void testAllUpper() {
        String result = StringsExerciseA.yell("ABA");
        assertEquals(result, "ABA");
    }
    
    @Test
    public void testRandom() {
        String result = StringsExerciseA.yell("AbcdEFG");
        assertEquals(result, "ABCDEFG");
    }
    
}
