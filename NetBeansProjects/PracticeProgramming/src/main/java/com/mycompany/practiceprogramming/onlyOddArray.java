/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming;

import java.util.Arrays;

/**
 *
 * @author Jose
 */
public class onlyOddArray {

    static int numbersLength;

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        lengthFinder(numbers);
        int[] pretty= odds(numbers);
        
        System.out.println(Arrays.toString(pretty));


    }

    public static void lengthFinder(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbersLength++;

            }
        }

    }

    public static int[] odds(int[] array) {
        int j = 0;
        int[] newOdd = new int[numbersLength];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                newOdd[j] = array[i];

                j++;

            }
        }
        return newOdd;
    }
}
