package com.company;

import java.util.Scanner;

public class Qn1 {

    static double pi = 3.14159;

    public static void main(String[] args) {

        // first part

        Scanner input = new Scanner(System.in);

        // minimum value of -128 and a maximum value of 127 (inclusive)
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();
        System.out.println("Byte value entered is: " + byteValue + "\n");

        // minimum value of -32,768 and a maximum value of 32,767 (inclusive)
        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();
        System.out.println("Short value entered is: " + shortValue + "\n");

        // minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive)
        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();
        System.out.println("Int value entered is: " + intValue + "\n");

        // minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive)
        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();
        System.out.println("Long value entered is: " + longValue + "\n");

        // minimum value of 1.175494351 E - 38 and a maximum value of 3.402823466 E + 38 (inclusive)
        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();
        System.out.println("Float value entered is: " + floatValue + "\n");


        // second part
        // take in input as radius of circle, then output area, area = radius * radius * pi (constant 3.14159)

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
