package com.company;

import java.util.Scanner;

public class HackerrankKJAndStreetLights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[p + 2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int r = sc.nextInt();
            int l = Math.max(0, x - r);
            int right = Math.min(p + 1, x + r + 1);
            arr[l] += 1;
            arr[right] -= 1;
        }
        for (int i = 1; i <= p; i++)
            arr[i] += arr[i - 1];
        int ans = 0;
        int j = 0;
        int max = 0;
        while (j <= p) {
            if (arr[j] != 1)
                max++;
            else {
                ans = Math.max(ans, max);
                max = 0;
            }
            j++;
        }
        System.out.println(Math.max(ans, max));
    }
}
