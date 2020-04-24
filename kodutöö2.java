package com.company;

import java.util.Random;
import java.util.Scanner;

class kodutöö2 {

    static int rahaKulu = 0;
    static Scanner num = new Scanner(System.in);
    static int randomNum = new Random().nextInt((100001) + 1);

    static void algus() {
        System.out.println("Want to win a million dollars?\n" + "If so, guess the winning number (a number between 0 and 100000).");
    }

    static String giveGuess() {
        System.out.println("Insert $1.00 and enter your number or 'q' to quit:");
        return num.nextLine();
    }

    static String giveHint() {
        System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
        return num.nextLine();
    }

    static void insertHint(int a) {
        System.out.println("Insert $2.00 for the hint!");
        rahaKulu += 2;
        if (a > randomNum) {
            System.out.println("Your number is too high!");
        } else {
            System.out.println("Your number is too low!");
        }
    }

    static Boolean compare(int guess) {
        return randomNum == guess;
    }


    public static void main(String[] args) {
        algus();
        while (true) {
            String guess = giveGuess();
            if (guess.equals("q")) {
                System.out.println(String.format("You lost $%d.00. Thanks for playing. Come again!", rahaKulu));
                break;
            } else {
                rahaKulu += 1;
                int i = Integer.parseInt(guess);
                if (compare(i)) {
                    System.out.println("YOU WIN!");
                    break;
                } else {
                    String hint = giveHint();
                    if (hint.equals("y")) {
                        insertHint(i);
                    }
                }
            }

        }
    }
}
