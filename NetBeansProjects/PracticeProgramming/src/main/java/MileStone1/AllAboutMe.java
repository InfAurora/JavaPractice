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
public class AllAboutMe {
    public static void main(String[] args) {
        // declaring variables
        String name, food, place;
        int pets;
        Boolean whistle;
        // assigning values
        name = "Jose Alba";
        food = "chicken";
        place = "house";
        pets = 1;
        whistle = true;
        
        // outputing values I entered about myself
        System.out.println("My name is " + name + ".");
        System.out.println("My favorite food is oven cooked " + food + ".");
        System.out.println("I have " + pets + " pets.");
        System.out.println("I live at my parents" + place + " and I don't have to pay rent.");
        System.out.println("It is " + whistle + " I know how to whistle.");
    }
}
