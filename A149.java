package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A149 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[12];
        for (int i = 0; i < 12; i++)
            arr[i] = sc.nextInt();

        int ans = 0;
        int sum = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            if (sum >= n) break;
            ans++;
            sum += i;
        }
        if (sum < n)
            System.out.println("-1");
        else
            System.out.println(ans);
    }
}
