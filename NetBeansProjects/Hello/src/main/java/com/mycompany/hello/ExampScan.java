/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class ExampScan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0;
        do {
            System.out.println("Enter a number");
            try {
                i = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException ex) {
                System.out.println("That was not a number!");
            }
        } while (i > 10);
    }
}
