package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String primes = "235711";
        String currentId = "";
        int num = 0;
        String numFromHat = "";
        int i = 12;
        do {
            if ((i%2) != 0) {
                if ((i%3) != 0) {
                    if ((i%5) != 0) {
                        if ((i%7) != 0) {
                            if ((i%11) != 0) {
                                primes += i;
                            }
                        }
                    }
                }
            }
            i += 1;
        } while (primes.length() <= 10000);
        primes += "1";
        do {
            try {
                System.out.println("Enter a number:");
                numFromHat = input.nextLine();
                num = Integer.valueOf(numFromHat);
                if (num >= 0 || num <= 10000) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Try again\n");
            }
        } while (true);
        currentId = String.valueOf(primes.charAt(num)) + String.valueOf(primes.charAt(num + 1)) + String.valueOf(primes.charAt(num + 2)) + String.valueOf(primes.charAt(num + 3)) + String.valueOf(primes.charAt(num + 4));
        System.out.println(currentId);
    }
}
