package com.company;

import java.util.Scanner;

public class A122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[] lucky = {4,7,47,74,44,444,447,474,477,777,774,744};
        for (int i : lucky) {
            if (n % i == 0)
                flag = true;
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
