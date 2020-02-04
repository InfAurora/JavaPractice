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
public class ordered {
    
    public static void main(String[] args) {
        
        int[] array1 = new int[] {2, 4, 2, 5, 6};
        System.out.println(orderedChecker(array1));
        
        
    }
    
    public static boolean orderedChecker(int array[]){
        boolean isOrdered = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isOrdered = false;
                break;
            } 
        }
        
        
        return isOrdered;
    }
}
