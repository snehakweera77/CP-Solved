package com.company;

import java.util.Scanner;

public class A476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        if (m > n)
            x = -1;
        else
        {
            if (n % 2 == 0)
                x = n / 2;
            else
                x = (n / 2) + 1;
            while (x%m != 0)
            {
                x++;
            }
        }
        System.out.println(x);
    }
}
