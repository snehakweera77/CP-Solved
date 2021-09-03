package com.company;

import java.util.*;

class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int mid = k / 2;
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                pq.add(s[i]);
                map.put(s[i], i);
            }
            int ans = 0;
            PriorityQueue<Integer> ind = new PriorityQueue<>();
            for (int i = 0; i < k; i++) {
                int temp = pq.poll();
                if (i == mid)
                    ans = temp;
                ind.add(map.get(temp));
            }
            System.out.println(ans);
            for (int i = 0; i < k; i++) {
                System.out.print(s[ind.poll()] + " ");
            }


        }

    }
}
