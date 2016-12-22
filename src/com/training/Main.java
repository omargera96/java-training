package com.training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numbers nm = new Numbers();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number.");
        int number = reader.nextInt();
        int result = nm.addNumberDigits(number);
        System.out.println("Result of: " + number + " is " + result);
    }
}
