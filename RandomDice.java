/*
* This is a program that generates a random number
* between 1 and any max number.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-04-28
*/

import java.util.Scanner;
import java.util.Random;


final class RandomDice {
    private RandomDice() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }


    public static void rollDie(final int maxValue) {
        final int low = 1;
        final int high = maxValue;
        int randomNumber;

        // generate randon number
        Random rand = new Random();
        randomNumber = rand.nextInt(high - low + 1) + low;
        // output
        System.out.println("\nRandom number: " + randomNumber);
    }


    public static void main(final String[] args) {
        int maxValue;

        System.out.println("This program generates a random number "
                           + "between 1 and any number you would like.");
        // input
        Scanner maxString = new Scanner(System.in);
        System.out.print("your maximum number: ");

        try {
            maxValue = maxString.nextInt();

            if (maxValue > 0) {
                // pass maxValue to function rollDie
                rollDie(maxValue);
            } else {
                System.out.println("Please enter a positive integer");
            }
        } catch (Exception ex) {
            System.err.print("This is not an integer");
        }
    }
}
