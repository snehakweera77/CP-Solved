package com.company;

import java.util.Scanner;

public class A378 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aWin = 0;
        int bWin = 0;
        int draw = 0;
        for (int i = 1; i <= 6; i++) {
            int aa = Math.abs(a - i);
            int bb = Math.abs(b - i);
            if (aa == bb)
                draw++;
            else if (aa < bb)
                aWin++;
            else
                bWin++;
        }
        System.out.println(aWin + " " + draw + " " + bWin);
    }
}
