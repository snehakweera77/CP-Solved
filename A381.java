package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int d = 0;
        int l = 0;
        int r = n - 1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(arr[r]>arr[l])
                {
                    s+=arr[r];
                    --r;
                }
                else{
                    s+=arr[l];
                    ++l;
                }
            }
            else{
                if(arr[r]>arr[l])
                {
                    d+=arr[r];
                    --r;
                }
                else{
                    d+=arr[l];
                    ++l;
                }
            }
        }
        System.out.println(s + " " + d);
    }
}
