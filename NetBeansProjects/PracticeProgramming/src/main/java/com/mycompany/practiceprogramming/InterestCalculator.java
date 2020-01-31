/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class InterestCalculator {

    public static double initialInvestment;
    public static double currentBalance;
    public static double yearsIn;
    public static double totalInterest;
    public static double principal;

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("How much do you want to invest? ");
        initialInvestment = Double.parseDouble(myScan.nextLine());

        System.out.println("How many years are investing? ");
        yearsIn = Double.parseDouble(myScan.nextLine());

        System.out.println("What is the annual inteserst rate % growth? ");
        totalInterest = Double.parseDouble(myScan.nextLine());

        System.out.println("\nCalculating...");

        quarters();
    }

    public static double earned() {
        double quarterlyInterestRate = (totalInterest / 4);
        return initialInvestment * (1 + (quarterlyInterestRate / 100)) - (initialInvestment);
    }

    public static double principal() {
        double quarterlyInterestRate = (totalInterest / 4);
        return initialInvestment * (1 + (quarterlyInterestRate / 100));
    }

    public static void quarters() {
        int yearNum = 1;
        int counter = 0;

        while (yearNum <= yearsIn) {
            if (counter == 0) {

                System.out.println("Year " + yearNum);
                System.out.println("-------");
            }
            for (counter = 1; counter < 5; counter++) {
                System.out.println("Quarter " + counter + ": ");
                System.out.println("Began with $" + initialInvestment);
                System.out.println("Earned     $ " + earned());
                System.out.println("Ended with $" + principal() + "\n");
                initialInvestment = principal();
            }
            counter = 0;
            yearNum++;
            System.out.println("\n");

        }
    }
}
