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
public class reversedArray {
    static int[] newArray = new int[6];
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 5, 6, 7, 8, 9};
        reversed(numbers);
        System.out.println(Arrays.toString(newArray));
        
    }
    
    public static void reversed(int array[]) {
        
        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[(array.length - 1) - i];
        }
     
    }
}
