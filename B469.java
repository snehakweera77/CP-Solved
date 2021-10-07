package com.company;

import java.util.Scanner;

public class B469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] c = new int[q];
        int[] d = new int[q];
        int[] a = new int[p];
        int[] b = new int[p];
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = l; i <= r; i++) {
            boolean f = false;
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < q; k++) {
                    if (a[j] >= c[k] + i && a[j] <= d[k] + i)
                        f = true;
                    if (c[k] + i>= a[j] && c[k] + i<= b[j])
                        f = true;
                }
            }
            if (f)
                ans++;
        }
        System.out.println(ans);
    }
}
