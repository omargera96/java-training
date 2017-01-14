package com.training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numbers nm = new Numbers();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number. ");
        int n1 = reader.nextInt();
        int result = nm.lateRide(n1);
        System.out.println("Result of: " + n1 +  " is " + result);
    }
}
