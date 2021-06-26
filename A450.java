package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A450 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arr[i] += sc.nextInt();
            q.add(i);
        }
        int i = 0;
        while (!q.isEmpty()) {
            i = q.poll();
            arr[i] = arr[i] - m;
            if (arr[i] > 0)
                q.add(i);
        }
        System.out.println(i + 1);
    }
}
