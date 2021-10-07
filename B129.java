package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class B129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] degree = new int[n + 1];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            adjList.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            degree[u]++;
            degree[v]++;
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        int count = 0;
        while (true) {
            ArrayList<Integer> l = new ArrayList<>();
            int flag = 0;
            for (int i = 1; i <= n; i++) {
                if (degree[i] == 1) {
                    flag = 1;
                    degree[i]--;
                    l.add(i);
                }
            }
            if (flag == 0)
                break;
            count++;
            for (int i : l) {
                for (int j : adjList.get(i))
                    degree[j]--;
            }
        }
        System.out.println(count);
    }
}
