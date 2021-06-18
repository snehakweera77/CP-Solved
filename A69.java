package com.company;
import java.util.Scanner;

public class A69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] dim = new int[3];
        while (t-- > 0) {
            dim[0] += sc.nextInt();
            dim[1] += sc.nextInt();
            dim[2] += sc.nextInt();
        }
        if (dim[0] == 0 && dim[1] == 0 && dim[2] == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
