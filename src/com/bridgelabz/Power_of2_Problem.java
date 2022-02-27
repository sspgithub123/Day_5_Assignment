package com.bridgelabz;

import java.util.Scanner;

public class Power_of2_Problem {
    public static void main(String[] args) {

        System.out.println("Enter a number ::");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Power of 2^" + num + " is: " + (Math.pow(2, num)));

        for (int i = 1; i <= num; i++)
            System.out.println("Power of 2^" + i + "is: " + (Math.pow(2, num)));
    }

}
