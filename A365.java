package com.company;

import java.util.Scanner;

public class A365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean[] nums = new boolean[10];
            int a = sc.nextInt();
            while (a != 0) {
                int dig = a % 10;
                a /= 10;
                nums[dig] = true;
            }
            boolean f = true;
            for (int j = 0; j <= k; j++) {
                if (!nums[j])
                    f = false;
            }
            if (f)
                count++;
        }
        System.out.println(count);
    }
}
