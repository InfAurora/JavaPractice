/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FizzBuzz;

/**
 *
 * @author Jose
 */
public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            if (i % 105 == 0) {
                System.out.println("FizzBuzzBazz");
            }else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 21 == 0){
                System.out.println("FizzBazz");
            } else if (i % 35 == 0) {
                System.out.println("BuzzBazz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0){
                System.out.println("Bazz");
            } else {
                System.out.println(i);
            }
        }
    }
}
