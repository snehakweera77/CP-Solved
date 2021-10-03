package com.company;

import java.util.Scanner;

public class B463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int ans = 0;
        int energy = 0;
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            energy += x - y;
            if (energy < 0) {
                ans += (energy * -1);
                energy = 0;
            }
            x = y;
        }
        System.out.println(ans);
    }
}
