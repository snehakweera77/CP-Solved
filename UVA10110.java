package com.company;

import java.io.IOException;
import java.util.Scanner;

public class UVA10110 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long l;
        while (true) {
             l = sc.nextLong();
             if (l == 0) return;
            long sq = (long) Math.sqrt(l);
            if (sq * sq == l)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
