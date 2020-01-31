/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MileStone1;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class PassingTheTurningTest {
    public static void main(String[] args) {
        String name, myName, color, myColor, food, myFood;
        double number, myNumber, sum;
        myName = "Jose";
        myColor = "Blue";
        myNumber = 12;
        myFood = "chicken";
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Hi!");
        System.out.print("What is your name? ");
        name = myScan.nextLine();
        
        System.out.println("Hi," + name + "! I'm " + myName + ".");
        
        System.out.print("What is your favorite color? ");
        color = myScan.nextLine();
        
        System.out.println("Huh, " + color + "?" + " Mine is " + myColor + ".");
        
        System.out.print("I really like " + myFood + 
                ". It can be prepared in so many ways! What is your favorite food, " + name + "? ");
        food = myScan.nextLine();
        
        System.out.print("Really? " + food + " That's cool! \nSpeaking of favorites, what's your favorite number? ");
        number = Double.parseDouble(myScan.nextLine());
        sum = number * myNumber;
        
        System.out.println(number + " is a cool number. Mine is " + myNumber + ".");
        System.out.println("Did you know " + number + " * " + myNumber + 
                " is " + sum + "? Thats a cool number too!");
        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
