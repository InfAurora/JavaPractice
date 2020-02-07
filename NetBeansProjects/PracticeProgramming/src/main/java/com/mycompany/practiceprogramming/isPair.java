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
public class isPair {

    // is there a pair in the array that add up to the int given
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        if (isTrue(nums, 5) == true) {
            System.out.println("There is!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static boolean isTrue(int isTrue[], int number) {
        for (int i = 0; i < isTrue.length; i++) {
            for (int j = 0; j < isTrue.length; j++) {
                int sum = isTrue[i] + isTrue[j + 1];
                if (sum == number) {
                    return true;
                }

            }
        }
        return false;
    }
}
