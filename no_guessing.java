package com.company;
import java.util.*;
public class no_guessing {
    public static void Game()
    {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100* Math.random());

        int attempts = 10;

        int i, guess,attempt=0;

        System.out.println("Please choose a number"	+ " between 1 to 100."+ "\tGuess the number"+ " within 10 trials.");

        for (i = 0; i < attempts; i++) {

            System.out.println("Guess a number:");
            guess = sc.nextInt();
            attempt += 1;

            if (number == guess) {
                System.out.println("Congratulations!"+ " You won the match in "+attempt+" attempts !!");
                break;
            }
            else if (number > guess	&& i != attempts - 1) {
                System.out.println("number is " + "greater than " + guess);
            }
            else if (number < guess	&& i != attempts - 1) {
                System.out.println("number is" + " less than " + guess);
            }

        }
        if (i == attempts) {
            System.out.println("You have exhausted all your "+ attempts + "attempt");

            System.out.println("correct number was " + number);
            System.out.println("Thankyou for playing this game !!\n Have a nice day");
        }
    }
    public static void main(String arg[])
    {
        Game();
    }
}
