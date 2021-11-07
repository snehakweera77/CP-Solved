package com.company;

import java.util.Scanner;

public class B152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long xc = sc.nextLong();
        long yc = sc.nextLong();
        long k = sc.nextLong();
        long ans = 0;
        for (int i = 0; i < k; i++) {
            long dx = sc.nextLong();
            long dy = sc.nextLong();
            long l = 0;
            long r = 1000000009;
            long mid = 0;
            long steps = 0;
            while (l <= r) {
                mid = l + (r - l) / 2;
                if (isValid(xc + (dx * mid), yc + (dy * mid), n, m)) {
                    steps = mid;
                    l = mid + 1;
                }
                else
                    r = mid - 1;
            }
            ans += steps;
            xc += (dx * steps);
            yc += (dy * steps);
        }
        System.out.println(ans);
    }

    private static boolean isValid(long x, long y, long n, long m) {
        return x > 0 && x <= n && y > 0 && y<= m;
    }
}
