package com.bridgelabz;

import java.util.Scanner;

public class Leap_year_Problem {
    public static void main(String[] args) {

        System.out.println("Enter the Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("This is a leap year");

        else
            System.out.println("This is not a leap year");

    }
}
