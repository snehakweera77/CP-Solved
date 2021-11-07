package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class HackerEarthUnlucky13 {
    public static FastReader sc = new FastReader();
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            String max = "";
            long p = -1;
            long d = 0;

            for (int i = 0; i < n; i++) {
                if (s.compareTo(max) > 0) {
                    max = s;
                    d = i;
                }
                else if (s.equals(max)) {
                    p = i - d;
                    break;
                }
                s = s.substring(1) + s.charAt(0);

            }
            if (p == -1)
                System.out.println(d + (k - 1) * n);
            else
                System.out.println(d + (k - 1) * p);
        }

        out.write(sb.toString());
        out.flush();
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
