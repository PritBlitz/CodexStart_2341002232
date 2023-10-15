/*
    * NAME : PRITISH BISWAS 
    * CSES - PERMUTATION 
   * LINK : https://cses.fi/problemset/task/1070 
*/

import java.util.Scanner;

public class Q8_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 1) {
            System.out.print("1 ");
        } else if (n <= 3) {
            System.out.println("NO SOLUTION");
        } else {

            StringBuilder per = new StringBuilder();
            StringBuilder remper = new StringBuilder();
            for (long i = 2; i <= n; i += 2) {
                per.append(i).append(" ");
            }
            for (long i = 1; i <= n; i += 2) {
                remper.append(i).append(" ");
            }
            per.append(remper);
            System.out.println(per);
        }
    }
}
