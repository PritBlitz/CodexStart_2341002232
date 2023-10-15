/* 
   * NAME : PRITISH BISWAS
   * CSES - WEIRD ALGORITHMS 
   * LINK : https://cses.fi/problemset/task/1068 
*/

import java.util.Scanner;

public class Q1_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n < 1) {
            System.out.println("n is not a positive integer ! ");
        }
        else {
            while (n != 1) {
                System.out.print(n + " ");
                if (n % 2 == 1) {
                    n = (3 * n) + 1;
                } else {
                    n /= 2 ;
                }
            }
            System.out.print(1);
        }
    }
}
