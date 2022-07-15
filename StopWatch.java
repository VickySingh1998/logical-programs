package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to start the stop watch");
        double startWatch=scanner.nextDouble();

        startWatch=System.currentTimeMillis();

        System.out.println("Press 0 to stop the stop watch");
        double stopwatch=scanner.nextDouble();
        stopwatch=System.currentTimeMillis();

        System.out.println("The Elapsed time is  "+((stopwatch-startWatch)/1000) + " seconds ");
    }
}
