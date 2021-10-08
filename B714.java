package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class B714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        Arrays.sort(x);
        int a = 1;
        int[] y = new int[3];
        y[0] = x[0];
        for (int i = 1; i < n; i++) {
            if (x[i] != x[i - 1])
                a++;
            if (a == 2)
                y[1] = x[i];
            if (a == 3)
                y[2] = x[i];;
        }
        if (a == 1 || a == 2)
            System.out.println("YES");
        else if (a == 3 && ((2 * y[1]) == y[0] + y[2]))
            System.out.println("YES");
        else
            System.out.println("NO");




    }
}
