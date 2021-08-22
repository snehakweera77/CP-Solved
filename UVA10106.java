package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class UVA10106 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            BigInteger a, b;
            while (sc.hasNext()) {
                a = sc.nextBigInteger();
                b = sc.nextBigInteger();
                System.out.println(a.multiply(b));
            }
        }
}
