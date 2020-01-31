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
public class MultiplyWithout {
    public static void main(String[] args) {
        int x, y, c = 0;
        
        Scanner myScan = new Scanner(System.in);
        
        System.out.print("Please give me the first number: ");
        x = myScan.nextInt();
        
        System.out.print("Please give me the second number: ");
        y = myScan.nextInt();
        
        
        for(int i = 0; i < y; i++) {
            c = c + x;
        }
        System.out.println(c);
    }
}