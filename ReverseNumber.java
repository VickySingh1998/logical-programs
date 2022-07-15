package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int reverse=0, remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number=>");
        int num = scanner.nextInt();
        while(num!=0) {
            remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;
        }
        System.out.println("The Reverse Number is " +reverse);
    }

}