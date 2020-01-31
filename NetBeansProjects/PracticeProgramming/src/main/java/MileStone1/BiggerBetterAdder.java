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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        int a, b, c, answer;
        Scanner myScan = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        a = Integer.parseInt(myScan.nextLine());
        
        System.out.print("Enter the second number: ");
        b = Integer.parseInt(myScan.nextLine());
        
        System.out.print("Enter the third number: ");
        c = Integer.parseInt(myScan.nextLine());
        
        answer = a + b + c;
        
        System.out.println("The sum of those numbers is " + answer + ".");
    }
}
