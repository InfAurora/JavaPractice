/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MileStone1;

/**
 *
 * @author Jose
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        int butterflies, beetles, bugs;
        butterflies = 5;
        beetles = 9;
        
        bugs = beetles + butterflies;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh ohm my dog ate one.");
        butterflies--;
        bugs = beetles + butterflies;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }
}