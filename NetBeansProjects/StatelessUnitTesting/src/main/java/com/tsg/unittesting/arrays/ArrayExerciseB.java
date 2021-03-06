/** *******************************
 * The Software Guild
 * Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
 ******************************** */
package com.tsg.unittesting.arrays;

import java.util.Arrays;

/**
 *
 * @author ahill
 */
public class ArrayExerciseB {

    /**
     * Given a integer and an array of ints, times each number in the array by
     * the multiplier.
     *
     * Example Results: multiplyAll( 5 , [ 1 , 2 , 3 , 4 , 5 ] ) -> [ 5 , 10 ,
     * 15 , 20 , 25 ] multiplyAll( 0 , [ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 ] )
     * -> [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ] multiplyAll( -1 , [ -2 , 0 , 0 ,
     * 1 ] ) -> [ 2 , 0 , 0 , -1 ]
     *
     * @param multiplier
     * @param numbers
     * @return int[] numbers multiplied
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5}; 
        System.out.println(Arrays.toString(multiplyAll(5 , nums)));
    }
    public static int[] multiplyAll(int multiplier, int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            int sum = 0;
            sum = numbers[i] * multiplier;
            numbers[i] = sum;
        }
        return numbers;
    }
}

