package com.company;

import java.io.IOException;
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0 && n != 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
