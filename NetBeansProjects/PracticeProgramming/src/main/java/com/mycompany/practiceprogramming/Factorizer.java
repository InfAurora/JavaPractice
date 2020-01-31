/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Factorizer {

    public static void main(String[] args) {
        int num;
        int perfect = 0;
        int i = 1;
        int j = 1;
        int variables = 0;
        int counter = 1;
        Scanner myScan = new Scanner(System.in);

        System.out.println("What number would you like to factor?");
        num = myScan.nextInt();

        System.out.println("The factors of " + num + " are:");
        for (j = 1; j <= (num / 2); j++) {
            if (num % j == 0) {
                variables += j;
                System.out.print(j + " ");
                counter++;
            }
        }
        System.out.println(variables);
        System.out.println();
        System.out.println(num + " has " + counter + " factors.");

        if (num == variables) {
            System.out.println("\n" + num + " is a perfect number.");
        }
        
        if (counter == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
