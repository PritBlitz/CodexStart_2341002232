/*
    * NAME : PRITISH BISWAS 
    * CSES - INCREASING ARRAY 
    * LINK : https://cses.fi/problemset/task/1094
*/

import java.util.Scanner;
public class Q5_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x;
        long res = 0;
        long[] val = new long[(int) n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextLong();
        }
        for (int i = 1; i < n; i++) {
            if (val[i] < val[i - 1]) {
                res += (val[i - 1] - val[i]);
                val[i] = val[i - 1];
            }
        }

        System.out.println(res);
    }
}
