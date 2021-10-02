package com.company;

import java.util.Scanner;

public class A287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] cArr = new char[4][4];
        for (int i = 0; i < 4; i++) {
            cArr[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int cntB = 0;
                int cntW = 0;
                if (cArr[i][j] == '#')
                    cntB++;
                else cntW++;
                if (cArr[i + 1][j] == '#')
                    cntB++;
                else cntW++;
                if (cArr[i][j + 1] == '#')
                    cntB++;
                else cntW++;
                if (cArr[i + 1][j + 1] == '#')
                    cntB++;
                else cntW++;
                if (cntB >= 3) {
                    System.out.println("YES");
                    return;
                }
                if (cntW >= 3) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
