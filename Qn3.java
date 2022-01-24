package com.company;

public class Qn3 {

    public static void main(String[] args) {

        // obtain the total milliseconds
        long milliSeconds = System.currentTimeMillis();

        // obtain the total seconds
        long totalSeconds = milliSeconds / 1000;

        // obtain the current second
        long currentSecond = totalSeconds % 60;

        // obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // obtain the current minute
        long currentMinute = totalMinutes % 60;

        // obtain the total hours
        long totalHours = totalMinutes / 60;

        // compute current hour
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
