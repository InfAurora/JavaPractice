/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class InterestCalculator {

    public static BigDecimal initialInvestment;
    public static BigDecimal currentBalance;
    public static BigDecimal yearsIn;
    public static BigDecimal totalInterest;
    public static BigDecimal principal;

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("How much do you want to invest? ");
        initialInvestment  = new BigDecimal(myScan.nextLine());

        System.out.println("How many years are investing? ");
        yearsIn = new BigDecimal(myScan.nextLine());

        System.out.println("What is the annual inteserst rate % growth? ");
        totalInterest = new BigDecimal(myScan.nextLine());

        System.out.println("\nCalculating...");

        quarters();
    }

    public static BigDecimal earned() {
        BigDecimal quarterlyInterestRate = (totalInterest.divide(new BigDecimal("4")));
        return initialInvestment.multiply(new BigDecimal("1")
                .add(quarterlyInterestRate.divide(new BigDecimal("100"))).subtract(initialInvestment));
        //return initialInvestment * (1 + (quarterlyInterestRate / 100)) - (initialInvestment);
    }

    public static BigDecimal principal() {
        BigDecimal quarterlyInterestRate = (totalInterest.divide(new BigDecimal("4")));
        return initialInvestment.multiply(new BigDecimal("1")
                .add(quarterlyInterestRate.divide(new BigDecimal("100"))));
        //return initialInvestment * (1 + (quarterlyInterestRate / 100));
    }

    public static void quarters() {
        BigDecimal yearNum = new BigDecimal("1");
        BigDecimal counter = new BigDecimal("0");

        while (yearNum.compareTo(yearsIn) <= 0) {
            if (counter.compareTo(new BigDecimal(0)) == 0) {

                System.out.println("Year " + yearNum);
                System.out.println("-------");
            }
            for (counter = counter.ONE; counter.compareTo(new BigDecimal(5)) < 0; counter = counter.add(new BigDecimal(1))) {
                System.out.println("Quarter " + counter + ": ");
                System.out.println("Began with $" + initialInvestment);
                System.out.println("Earned     $" + earned());
                System.out.println("Ended with $" + principal() + "\n");
                initialInvestment = principal();
            }
            counter = counter.ZERO;
            yearNum = yearNum.add(new BigDecimal(1));
            System.out.println("\n");

        }
    }
}
