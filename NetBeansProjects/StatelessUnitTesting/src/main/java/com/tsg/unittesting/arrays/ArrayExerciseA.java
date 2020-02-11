/** *******************************
 * The Software Guild
 * Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
 ******************************** */
package com.tsg.unittesting.arrays;

/**
 *
 * @author ahill
 */
public class ArrayExerciseA {

    public static void main(String[] args) {
        int[] num1 = {-7 , -2, -3, -4, -5};
        System.out.println(maxOfArray(num1));
        /**
         * Given an array of ints, find and return the maximum value.
         *
         * Example Results: maxOfArray( {1} ) -> 1 maxOfArray( {3,4,5} ) -> 5
         * maxOfArray( {-9000, -700, -50, -3} ) -> -3
         *
         * @param numbers array of integers
         * @return int max
         */
    }

    public static int maxOfArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
