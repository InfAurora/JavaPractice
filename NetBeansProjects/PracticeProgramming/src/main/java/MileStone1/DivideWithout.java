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
public class DivideWithout {
    public static void main(String[] args) {
        int op1, op2;
        int counter = 0;
        Scanner myScan = new Scanner(System.in);
        
        System.out.print("Please give me the first number: ");
        op1 = myScan.nextInt();
        
        int opStr = op1;
        
        System.out.print("Please give me the first number: ");
        op2 = myScan.nextInt();
        
        while(op1 >= op2) {
            op1 = op1 - op2;
            counter++;
        }
        System.out.println(opStr + " divided by " + op2 + " equals " + counter);
    }
}
