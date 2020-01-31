/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MileStone1.Methods;

import java.util.Random;

/**
 *
 * @author Jose
 */
public class BarelyControlledChaos {

    public static Random rGen = new Random();

    public static void main(String[] args) {

        String color = colorName();
        String animal = animalName();
        String colorAgain = colorName();
       /* int weight = weight();
        //range 5 - 200
        int distance = distance();
        // 10 - 20
        int number = number();
        // 10,000 - 20,000
        int time = time();
        // 2 - 6*/

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ","
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!!");

        System.out.println("I had to hide in a field over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String colorName() {
        if (rGen.nextInt(5) == 1) {
            return "Red";
        } else if (rGen.nextInt(5) == 2) {
            return "Blue";
        } else if (rGen.nextInt(5) == 3) {
            return "Purple";
        } else if (rGen.nextInt(5) == 4) {
            return "Yellow";
        } else {
            return "Green";
        }

    }

    public static String animalName() {
        if (rGen.nextInt(5) == 1) {
            return "Dog";
        } else if (rGen.nextInt(5) == 2) {
            return "Cat";
        } else if (rGen.nextInt(5) == 3) {
            return "Bird";
        } else if (rGen.nextInt(5) == 4) {
            return "Owl";
        } else {
            return "Rat";
        }

    }
    
   // public static int weightDistanceNumberTime(){
        
    //}
}
