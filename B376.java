package com.company;

import java.util.Scanner;

public class B376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] debts = new int[n + 1];
        int[] owes = new int[n + 1];
        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            debts[b] += c;
            owes[a] += c;
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (debts[i] < owes[i])
                sum += owes[i] - debts[i];
        }
        System.out.println(sum);
    }
}
