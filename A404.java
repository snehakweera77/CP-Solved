package com.company;

import java.util.Scanner;

public class A404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[]arr = new String[n];
        sc.nextLine();

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        char diag = arr[0].charAt(0);
        char other = arr[1].charAt(0);
        boolean x = true;
        if (diag == other)
            x = false;
        for (int i = 0; i < n; i++) {
                if (arr[i].charAt(i) != diag || arr[i].charAt(n - 1 - i) != diag) {
                    x = false;
                }
            for (int j = 0; j < n; j++) {
                if (i != j && (n - i - 1) != j) {
                    if (arr[i].charAt(j) != other) {
                        x = false;
                    }
                }
            }
        }
        if (x)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
