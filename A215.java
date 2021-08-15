package com.company;

import java.io.IOException;
import java.util.Scanner;

public class A215 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++)
            nArr[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++)
            mArr[i] = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mArr[j] % nArr[i] == 0)
                    max = mArr[j] / nArr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mArr[j] % nArr[i] == 0 && max == mArr[j] / nArr[i])
                    count++;
            }
        }
        System.out.println(count);
    }
}
