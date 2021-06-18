package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class A80 {
    public static ArrayList<Integer>  sieve(int[] nums) {
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 2; i < 50; i++) {
            if (nums[i] == 0) {
                prime.add(i);
                int j = i + i;
                while (j < 50) {
                    nums[j] = 1;
                    j += i;
                }
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums= new int[50];
        ArrayList<Integer> prime = sieve(nums);
        for (int i = 0; i < prime.size() - 1; i++) {
            if (prime.get(i) == n) {
                if (m == prime.get(i + 1)) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
