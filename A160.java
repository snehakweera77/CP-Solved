package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            sum += coins[i];
        }
        Arrays.sort(coins, Collections.reverseOrder());
        int minAmount = sum / 2 + 1;
        int count = 0;
        int i = 0;
        while (minAmount > 0) {
            minAmount -= coins[i];
            count++;
            i++;
        }
        System.out.println(count);
    }
}
