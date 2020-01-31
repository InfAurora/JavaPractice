/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MileStone1.IfElse;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class GuessMe {
    public static void main(String[] args) {
        int myNum = 24;
        int guess;
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("I've chose a number. Betcha can't guess it!");
        guess =  myScan.nextInt();
        System.out.println("Your guess: " + guess);
        if (guess > myNum) {
            System.out.println(guess + "? Too bad, way too high. I chose " + myNum + ".");
        } else if (guess < myNum) {
            System.out.println(guess + "? Ha, nice try - too low! I chose " + myNum + ".");
        } else {
            System.out.println("Wow, nice guess! That was it!");
        }
        
    }
}
