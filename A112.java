package com.company;

import java.util.Scanner;

public class A112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            char cA = a.charAt(i);
            char cB = b.charAt(i);
            if (cA > cB) {
                System.out.println("1");
                return;
            }
            else if (cA < cB) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println("0");
    }
}
