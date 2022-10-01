package org.example;

import java.util.Scanner;

public class ConversionApp {
    public void conversionApp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To The Temperature Converter!");
        System.out.println("Please Enter the value to be converted:  ");

        double input = scanner.nextInt();

        System.out.println("Please Enter Unit to Convert to (F or C)");

        String input2 = scanner.next().toUpperCase();

        if (input2.equals("C")) {
            System.out.println((input - 32) * 0.5556);
        } else {
            System.out.println((input * 1.8) + 32);
        }
    }
}
