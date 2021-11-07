    package com.company;

    import java.util.*;

    class contest {
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int t = sc.nextInt();
            while(t-- > 0){
                solve();
            }
        }
        static int gcd(int a, int b)
        {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
        static int lcm(int a, int b)
        {
            return (a / gcd(a, b)) * b;
        }
        private static void solve() {
            int x = sc.nextInt();
            int k = sc.nextInt();
            int min = x * k;
            int max = x * k;
            Vector<Integer>[] mul = new Vector[min];
            for (int i = 1; i < x * k; i++) {
                if (mul[i].size() > 1) continue;
                mul[i].add(i);
            }
            for (int i = 1; i < x * k; i++) {
                if (mul[i].size() > 1) continue;
                mul[i].add(i);
            }
            for (int i = x * k; i >= 1; i--) {
                if ((i * i) < min)
                    break;
                for (int j = i - 1; j >= 1; j--) {
                    if ((i * j) < min)
                        break;
                    min = Math.max(max, lcm(i, j));
                }
            }
            System.out.println(min + " " + max);
        }
    }
