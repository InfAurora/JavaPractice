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
public class DoItBetter {
    public static void main(String[] args) {
        int miles, myMiles, eat, myEat, lang, myLang;
        Scanner myScan = new Scanner(System.in);
        
        System.out.print("How mant miles can you run? ");
        miles = Integer.parseInt(myScan.nextLine());
        myMiles = miles * 2 + 1;
        System.out.println("That's alot! But I can run " + myMiles + "!");
        
        System.out.print("How mant hotdogs can you eat? ");
        eat = Integer.parseInt(myScan.nextLine());
        myEat = eat * 2 + 1;
        System.out.println("That's alot! But I can eat " + myEat + "!");
        
        System.out.print("How mant miles can you run? ");
        lang = Integer.parseInt(myScan.nextLine());
        myLang = lang * 2 + 1;
        System.out.println("That's alot! But I know " + myLang + "!");
    }
}
