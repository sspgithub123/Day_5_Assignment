package com.bridgelabz;

import java.util.Scanner;

public class Vowel_Constant_Problem {
    public static void main(String[] args) {

        System.out.println("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        int i = 0;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Entered character " + ch + " is  Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Entered character " + ch + " is Consonant");

    }
}


