package com.company;
import java.util.Scanner;

public class A263 {
    public static void main(String[] args) {
        int r = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int v = sc.nextInt();
                if (v == 1) {
                    r = i;
                    c = j;
                    break;
                }
            }
        }
        int out = Math.abs(r - 3) + Math.abs(c - 3);
        System.out.println(out);
    }
}
