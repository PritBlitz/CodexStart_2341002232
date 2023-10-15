/*
   * NAME : PRITISH BISWAS 
   * CSES - MISSING NUMBER 
   * LINK : https://cses.fi/problemset/task/1083
*/

import java.util.Scanner;

public class Q7_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            long x = sc.nextLong();
            sum += x;
        }
        System.out.println((n * (n + 1) / 2) - sum);
    }
}
