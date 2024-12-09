package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        
        int targetNumber = random.nextInt(100) + 1; 
        int attempts = 0;
        int maxAttempts = 10; 
        boolean hasGuessed = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                hasGuessed = true;
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
        }

        if (!hasGuessed) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
