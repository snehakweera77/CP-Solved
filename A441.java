package com.company;

import java.util.Scanner;

public class A441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            boolean sell = false;
            for (int j = 0; j < a; j++) {
                int price = sc.nextInt();
                if (price + 1 <= v)
                    sell = true;
            }
            if (sell) {
                System.out.print(i + 1 + " ");
                flag = true;
            }
        }
        if (!flag)
            System.out.println("0");
    }
}
