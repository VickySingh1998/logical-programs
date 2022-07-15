package com.bridgelabz;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int firstTerm = 0, secondTerm = 1;
        int nextTerm;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
