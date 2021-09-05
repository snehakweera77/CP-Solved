package com.company;

import java.util.Scanner;

public class A255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chest = 0;
        int biceps = 0;
        int back = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (i % 3 == 0)
                chest += t;
            else if (i % 3 == 1)
                biceps += t;
            else
                back += t;
        }
        if (chest > biceps && chest > back)
            System.out.println("chest");
        else if (biceps > chest && biceps > back)
            System.out.println("biceps");
        else
            System.out.println("back");
    }
}
