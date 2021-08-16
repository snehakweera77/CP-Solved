package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class B34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++)
            nArr[i] = sc.nextInt();
        Arrays.sort(nArr);
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (nArr[i] >= 0)
                break;
            ans += nArr[i];
        }
        System.out.println(-ans);
    }
}
