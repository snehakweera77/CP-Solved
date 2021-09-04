package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (char[] row : arr)
            Arrays.fill(row, '.');
        boolean left = false;
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = '#';
            }
            if (left && i + 1 < n) {
                arr[i + 1][0] = '#';
                left = false;
            }
            else if (i + 1 < n) {
                arr[i + 1][m - 1] = '#';
                left = true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
