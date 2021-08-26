package com.company;

import java.util.Scanner;

public class CodechefMxpower {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int sum = a[i][j];
                    ans = Math.max(ans, sum);
                    for (int k = 1; k + i < n && k + j < n && i - k >= 0 && j - k >= 0; k++) {
                        sum += a[i][j - k];
                        sum += a[i][j + k];
                        sum += a[i - k][j];
                        sum += a[i + k][j];
                        for (int l = 1; l < k; l++) {
                            sum += a[i - l][j - k + l];
                            sum += a[i + l][j - k + l];
                            sum += a[i - l][j + k - l];
                            sum += a[i + l][j + k - l];
                        }
                        ans = Math.max(ans, sum);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
