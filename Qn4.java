package com.company;

import java.util.Scanner;

public class Qn4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create an array to store the 12 chinese zodiac
        String[] zodiac = new String[12];
        zodiac[0] = "monkey";
        zodiac[1] = "rooster";
        zodiac[2] = "dog";
        zodiac[3] = "pig";
        zodiac[4] = "rat";
        zodiac[5] = "ox";
        zodiac[6] = "tiger";
        zodiac[7] = "rabbit";
        zodiac[8] = "dragon";
        zodiac[9] = "snake";
        zodiac[10] = "horse";
        zodiac[11] = "sheep";

        // ask for user input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // find the chinese zodiac sign for the year
        int chineseZodiac = year % 12;

        // display the output
        System.out.println(zodiac[chineseZodiac]);
    }
}
