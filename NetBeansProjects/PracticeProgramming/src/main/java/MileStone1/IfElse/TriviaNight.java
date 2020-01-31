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
public class TriviaNight {
    public static void main(String[] args) {
        int answerOne, answerTwo, answerThree;
        int score = 0;
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        
        System.out.println("\nFIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?"
                + "\n1) Source Code       2) Assembly Language"
                + "\n3) C#                4) Machine Code");
        answerOne = myScan.nextInt();
        System.out.println("YOUR ANSWER: " + answerOne);
        if (answerOne == 4) {
            score++;
            System.out.print("Correct! Your score is " + score);
        }else { 
            System.out.println("Incorrect! Your score is " + score);
        }
        
        System.out.println("\nSECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?"
                + "\n1) Grace Hopper       2) Alan Turing"
                + "\n3) Charles Babbage    4) Larry page");
        answerTwo = myScan.nextInt();
        System.out.println("YOUR ANSWER: " + answerTwo);
        
        if (answerTwo == 2) {
            score++;
            System.out.print("Correct! Your score is " + score);
        }else { 
            System.out.println("Incorrect! Your score is " + score);
        }
        
        System.out.println("\nThird QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?"
                + "\n1) Serenity             2) The Battlestar Galactica"
                + "\n3) The USS Enterprise   4) The Millennium Falcon");
        answerThree = myScan.nextInt();
        System.out.println("YOUR ANSWER: " + answerThree);

        
        if (answerThree == 3) {
            score++;
            System.out.print("Correct! Your score is " + score);
        }else { 
            System.out.println("Incorrect! Your score is " + score);
        }
        
        if (score > 0) {
            System.out.println("Nice job - you got " + score + " correct!");
        } else {
            System.out.println("I'm sorry - you got 0 correct.");
        }
    }
}
