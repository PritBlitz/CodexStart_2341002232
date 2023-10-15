/*
    * NAME : PRITISH BISWAS 
    * CSES - BIT STRINGS
    * LINK : https://cses.fi/problemset/task/1617
*/

import java.util.Scanner;

public class Q3_1617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1 ;
        long x = (long) Math.pow(10,9)+7 ;
        for (int i = 0 ; i < n ; i++){
            // mathematically represented as 2^n
            res = (res*2) % x ;
        }
        System.out.println(res);
    }
}
