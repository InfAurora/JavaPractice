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
public class HealthyHearts {
    public static void main(String[] args) {
        int age, hr, maxHr;
        double minZone, maxZone;
        maxHr = 220;
        minZone = .5;
        maxZone = .85;
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = Integer.parseInt(myScan.nextLine());
        
        maxHr = maxHr - age;
        System.out.println("Your maximum heart rate should be " + maxHr + " beats per minute.");
        
        minZone = minZone * maxHr;
        maxZone = maxZone * maxHr;
        System.out.println("Your target HR Zone is " + minZone + " - " + maxZone + " beats per minute.");
        
    }
}
