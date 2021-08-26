package com.company;

import java.util.Scanner;

class CodechefCowa19b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];
        int[] arr1 = new int[n + 2];
        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            arr[l] += 1;
            arr[r + 1] -= 1;
            arr1[r + 1] -= (r - l + 1);
        }
        for (int i = 1; i <= n; i++)
            arr[i] += arr[i - 1];
        for (int i = 1; i <= n; i++)
            arr1[i] += arr1[i - 1] + arr[i];
        q = sc.nextInt();
        while (q-- > 0) {
            int i = sc.nextInt();
            System.out.println(arr1[i]);
        }

    }
}
