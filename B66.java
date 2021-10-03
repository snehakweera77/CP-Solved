package com.company;

import java.util.Scanner;
import java.util.Stack;

public class B66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int ans = 1;
        for (int i = 0; i <n; i++) {
            int temp = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j + 1] >= a[j])
                    temp++;
                else
                    break;
            }
            for (int j = i + 1; j < n; j++) {
                if (a[j - 1] >= a[j])
                    temp++;
                else
                    break;
            }
            ans = Math.max(ans, temp);
        }
        /*Stack<Integer> left = new Stack<>();
        int[] leftPoss = new int[n];
        leftPoss[0] = 1;
        left.push(0);
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                leftPoss[i] = leftPoss[i - 1] + 1;
                left.push(i);
            }
            else {
                while (!left.isEmpty() && a[left.peek()] <= a[i]) {
                    left.pop();
                }
                if (left.isEmpty()) {
                    leftPoss[i] = i + 1;
                    left.push(i);
                } else {
                    leftPoss[i] = i - left.peek();
                }
            }
        }
        Stack<Integer> right = new Stack<>();
        int[] rightPoss = new int[n];
        rightPoss[n - 1] = 1;
        right.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] >= a[i + 1]) {
                rightPoss[i] = rightPoss[i + 1] + 1;
                right.push(i);
            }
            else {
                while (!right.isEmpty() && a[right.peek()] <= a[i]) {
                    right.pop();
                }
                if (right.isEmpty()) {
                    rightPoss[i] = n - 1 + i;
                    right.push(i);
                } else {
                    rightPoss[i] = right.peek() - i;
                    right.push(i);
                }
            }

        }
        for (int i : leftPoss)
            System.out.print(i + " ");
        System.out.println();
        for (int i : rightPoss)
            System.out.print(i + " ");
        System.out.println();
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (61 == leftPoss[i] + rightPoss[i] - 1)
                temp = i;
            ans = Math.max(ans, leftPoss[i] + rightPoss[i] - 1);
        }*/
        System.out.println(ans);

    }
}
