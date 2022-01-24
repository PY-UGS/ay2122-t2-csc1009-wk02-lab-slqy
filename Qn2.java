package com.company;

import java.util.Scanner;

public class Qn2 {

    public static void main(String[] args) {

        // first part
        //System.in is a standard input stream
        Scanner input = new Scanner(System.in);

        // ask for user input
        System.out.print("Enter three numbers: ");

        // retrieve the first number
        float num1= input.nextFloat();   //reads string before the space
        // retrieve the second number
        float num2= input.nextFloat();   //reads string before the space
        // retrieve the third number
        float num3= input.nextFloat();   //reads string before the space

        // find the average of the three numbers
        float average = (num1 + num2 + num3)/3;
        // display the output
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);


        // second part

        // ask for user input
        System.out.print("Enter three numbers: ");
        // create an array to store the 3 numbers
        float[] numbers = new float[3];

        // ensure user input three numbers
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextFloat();
        }

        // find the average of the three numbers
        float average1 = (numbers[0] + numbers[1] + numbers[2])/3;
        // display the output
        System.out.println("The average of " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " is " + average1);
    }
}
