package com.company;

import java.util.Scanner;

public class CodechefCow3e {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int u = sc.nextInt();
        int q = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] pre = new int[n][m];
        for (int i = 0; i < u; i++) {
            int k = sc.nextInt();
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            pre[r1][c1] += k;
            if (r2 + 1 < n)
                pre[r2 + 1][c1] -= k;
            if (c2 + 1 < m)
                pre[r1][c2 + 1] -= k;
            if (r2 + 1 < n && c2 + 1 < m)
                pre[r2 + 1][c2 + 1] += k;
        }
        long[][] sum = new long[n][m];
        long[][] rowSum = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] += pre[i][j];
                rowSum[i][j] += pre[i][j];
                if (i > 0) {
                    sum[i][j] += sum[i - 1][j];
                }
                if (j > 0) {
                    sum[i][j] += rowSum[i][j - 1];
                    rowSum[i][j] += rowSum[i][j - 1];
                }
                mat[i][j] += sum[i][j];
            }
        }
        sum = new long[n][m];
        rowSum = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] += mat[i][j];
                rowSum[i][j] += mat[i][j];
                if (i > 0) {
                    sum[i][j] += sum[i - 1][j];
                }
                if (j > 0) {
                    sum[i][j] += rowSum[i][j - 1];
                    rowSum[i][j] += rowSum[i][j - 1];
                }
            }
        }
        for (int i = 0; i < q; i++) {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            long res = sum[r2][c2];
            if (r1 > 0) {
                res -= sum[r1 - 1][c2];
            }
            if (c1 > 0) {
                res -= sum[r2][c1 - 1];
            }
            if (r1 > 0 && c1 > 0) {
                res += sum[r1 - 1][c1 - 1];
            }
            System.out.println(res);
        }
    }
}
