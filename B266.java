package com.company;
import java.util.Scanner;

public class B266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        char[] ch = s.toCharArray();
        while (t-- > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (ch[i] == 'B' && ch[i + 1] == 'G') {
                    ch[i] = 'G';
                    ch[i + 1] = 'B';
                    i++;
                }
            }
        }
        System.out.println( String.valueOf(ch));
    }
}
