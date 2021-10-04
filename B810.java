package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class B810 {
    public static class Shop implements Comparable<Shop>{
        int k;
        int l;
        int x;
        Shop(int k, int l) {
            this.k = k;
            this.l = l;
            this.x = Math.min(k, l - k);
        }

        @Override
        public int compareTo(Shop o) {
            if (o.x != this.x)
                return o.x - x;
            if (o.k != k)
                return o.k - k;
            return o.l - l;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        Shop[] s = new Shop[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Shop p = new Shop(a, b);
            s[i] = p;
        }

        Arrays.sort(s);
        long product = 0;
        for (int i = 0; i < n; i++) {
            product += (long)Math.min(s[i].k, s[i].l);
            if (f > 0 && s[i].x > 0) {
                product += (long)s[i].x;
                f--;
            }
        }
        System.out.println(product);

    }
}
