package com.musa;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        TreeSet<Integer> guesses = new TreeSet<>();
        int secretNumber = rand.nextInt(100) + 1;
        int guess = 0;
        boolean correct = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TreeSet Guess Game");
        while (!correct) {
            System.out.println("Please enter your guess between 1 and 100:");
            guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }
            if (!guesses.add(guess)) {
                System.out.println("Your guess is already in the Set");
                continue;
            }

            if (guess == secretNumber) {
                System.out.println("Congratulations! You won!");
                correct = true;
            }else if (guess > secretNumber) {
                System.out.println("Your guess is too high");
            }else if (guess < secretNumber) {
                System.out.println("Your guess is too low");
            }

            System.out.println("Your guesses is " + guesses);

        }
        System.out.println("Game Over");
        scanner.close();
    }
}
