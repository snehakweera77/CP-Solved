package com.company;

import java.util.Scanner;

public class A144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] += sc.nextInt();
        }
        int min = height[0];
        int max = height[0];
        int min_pos = 0;
        int max_pos = 0;
        for (int i = 1; i < n; i++) {
            if (height[i] > max) {
                max = height[i];
                max_pos = i;
            }
            if (height[i] <= min) {
                min = height[i];
                min_pos = i;
            }
        }
        int time;
        if (max_pos < min_pos)
            time = max_pos + n - 1 - min_pos;
        else
            time = max_pos + n - 1 - min_pos - 1;
        System.out.println(time);
    }
}
