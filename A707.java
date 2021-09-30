package com.company;

import java.util.Scanner;

public class A707 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] color = new String[n][m];
        boolean colored = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                color[i][j] = sc.next();
                if (!(color[i][j].equals("W") || color[i][j].equals("B")  || color[i][j].equals("G")))
                    colored = true;
            }
        }
        if (colored)
            System.out.println("#Color");
        else
            System.out.println("#Black&White");

    }
}
