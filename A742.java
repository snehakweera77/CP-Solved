package com.company;

import java.util.Scanner;

public class A742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0)
            System.out.println("1");
        else {
            int[] digits = {8, 4, 2, 6};
            n = (n - 1) % 4;
            System.out.println(digits[n]);
        }
    }
}
