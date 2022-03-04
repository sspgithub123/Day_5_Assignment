package com.bridgelabz;

public class Power_of2_Problem {
    public static void main(String[] args) {
        int num;
        int mul = 1;
        num = Integer.parseInt(args[0]);
        if (num > 31) {
            System.out.println("value of number should be les than 31");
        } else {
            System.out.println(mul);
            for (int i = 1; i <= num; i++) {
                mul = mul * 2;
                System.out.println(mul);

            }

        }
    }
}