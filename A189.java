package com.company;

import java.util.Scanner;

public class A189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans=0;
        int rem = 0;
        int k = 0;
        for(int i=0;i*a<=n;++i)
        {
            for(int j=0;i*a+j*b<=n;++j)
            {
                rem=n-i*a-j*b;
                if(rem%c==0)
                {
                    k=rem/c;
                    ans=Math.max(ans,i+j+k);}
            }
        }
        System.out.println(ans);
    }
}
