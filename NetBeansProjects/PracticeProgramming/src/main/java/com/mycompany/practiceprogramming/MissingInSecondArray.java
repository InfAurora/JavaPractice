/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming;

/**
 *
 * @author Jose
 */
public class MissingInSecondArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, -2};
        int[] array2 = {1, 2, 3, 4, 5};
        
        System.out.println(arrayTwoChecker(array1, array2));
    }

    public static int arrayTwoChecker(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= array1.length - 1; i++) {
            sum1 += array1[i];
            }
        for (int j = 0; j <= array2.length - 1; j++) {
            sum2 += array2[j];
            }
        
        return sum1 - sum2;
    }
}
