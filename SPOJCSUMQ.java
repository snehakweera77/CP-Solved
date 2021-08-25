package com.company;

import java.util.Scanner;

public class SPOJCSUMQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] pre = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            pre[i] = sum;
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pre[r];
            if (l > 0)
                ans -= pre[l - 1];
            System.out.println(ans);
        }
    }
}
