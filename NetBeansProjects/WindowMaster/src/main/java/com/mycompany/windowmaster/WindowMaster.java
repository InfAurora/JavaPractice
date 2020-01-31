/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class WindowMaster {
    public static void main(String[] args) {
        float height;
        float width;
        
        String stringHeight;
        String stringWidth;
        
        float aOfWindow;
        float pOfWindow;
        float cost;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window Width");
        stringWidth = myScanner.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        aOfWindow = height * width;
        pOfWindow = 2 * (height + width);
        
        cost = ((3.50f * aOfWindow) + (2.25f * pOfWindow));
        
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + aOfWindow);
        System.out.println("Window perimeter = "  + pOfWindow);
        System.out.println("Total cost = " + cost);
        
    } 
}
