package com.company;
import java.util.*;
public class A136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            int k = sc.nextInt() - 1;
            arr[k] = i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
