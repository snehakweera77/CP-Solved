package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Uva10533 {

    static int MAX = 1000000;
    static boolean[] prime = new boolean[MAX + 1];
    static int[] dPrime = new int[MAX + 1];

    static int dSum(int n) {
        int T = 0;
        while (n != 0) {
            T += (n % 10);
            n /= 10;
        }
        return T;
    }
    static void sieve(){
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= MAX; i++) {
            dPrime[i] = dPrime[i - 1];
            if (prime[i]) {
                if (prime[dSum(i)]) ++dPrime[i];
                int j = i * i;
                while (j <= MAX) {
                    prime[j] = false;
                    j += i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(dPrime[b] - dPrime[a - 1]);
        }
    }
}
