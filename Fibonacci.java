package com.bridgelabz;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(firstTerm);

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
