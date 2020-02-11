/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jose
 */
public class ArrayExerciseATest {

    public ArrayExerciseATest() {
    }

    @Test
    public void testNegativeNums() {
        int[] nums = {-1, -2, -3, -4, -5};

        int result = ArrayExerciseA.maxOfArray(nums);
        assertEquals(result, -1);
    }

    @Test
    public void testRandomNegativeNums() {
        int[] nums = {-100, -2, -1, -4, -36};

        int result = ArrayExerciseA.maxOfArray(nums);
        assertEquals(result, -1);
    }

    @Test
    public void testPositiveNums() {
        int[] nums = {1, 2, 3, 4, 5};

        int result = ArrayExerciseA.maxOfArray(nums);
        assertEquals(result, 5);
    }

    @Test
    public void testRandomPositiveNums() {
        int[] nums = {10, 25, 3, 1, 2};

        int result = ArrayExerciseA.maxOfArray(nums);
        assertEquals(result, 25);
    }

    @Test
    public void testPositiveNegativeNums() {
        int[] nums = {-2, -1, 0, 1, 2};

        int result = ArrayExerciseA.maxOfArray(nums);
        assertEquals(result, 2);
    }

    @Test
    public void testRandomPositiveNegativeNums() {
        int[] nums = {-11, 0, -13, 89, -5};

        int result = ArrayExerciseA.maxOfArray(nums);
        assertEquals(result, 89);
    }

    @Test
    public void testZero() {
        int[] nums = {-11, 0, -13, -89, -5};

        int result = ArrayExerciseA.maxOfArray(nums);
        assertEquals(result, 0);
    }
}
