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
public class AllTheTrivia {
    public static void main(String[] args) {
        String a1, a2, a3, a4;
        Scanner myScan = new Scanner(System.in);
        
        System.out.print("What unit is equivalent to 1,024 Gigabytes? ");
        a1 = myScan.nextLine();
        
        System.out.print("Which planet is the only one that rotates clockwise in out Solar System? ");
        a2 = myScan.nextLine();
        
        System.out.print("The largest volcano ever discovered in our Soar System is located on"
                + "which planet? ");
        a3 = myScan.nextLine();
        
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        a4 = myScan.nextLine();
        
        System.out.println("Wow, 1,024 Gigabytes is a " + a3 + "!");
        
        System.out.println("I didn't know that the largest ever volcano was discovered on " + a1 + "");
        
        System.out.println("That's amazing that " + a4 + " is the most abundant element in the atmosphere...");
        
        System.out.println(a2 + " is the only planet that rotates clockwise, neat!");
        
    }
}
