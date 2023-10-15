/*
    * NAME : PRITISH BISWAS 
    * CSES - TRAILING ZEROS 
    * LINK : https://cses.fi/problemset/task/1618
*/


import java.util.Scanner;
public class Q9_1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cur = 5;
        long res = 0;

        while (cur <= n) {
            res += n / cur;
            cur *= 5;
        }

        System.out.println(res);
    }
}

