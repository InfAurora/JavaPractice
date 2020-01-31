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
public class Palindromes {

    static String word;

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("What word would you like to check if it is a palindrom? ");
        word = myScan.nextLine();
        
        if (isPal(word) == true) {
            System.out.println(word + " is a palindrome!");
        }else{
            System.out.println(word + " is not a palindrome");
        }
        
    }
        
        
        

    

    public static boolean isPal(String word) {
        String reversedWord = "";
        for (int i = 0; i < word.length(); i++) {
            reversedWord = word.charAt(i) + reversedWord;
        }
        return word.equals(reversedWord);
    }
}
   
