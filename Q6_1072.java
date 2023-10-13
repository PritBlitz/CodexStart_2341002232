import java.util.Scanner;
public class Q6_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        for (long k = 1; k <= n; k++) {
            // formula devised after studying the algorithm :  ((k^2)*(k^2 - 1))/2  - 4*(k-1)*(k-2)
            long totWays =  (k * k) * (k * k - 1) / 2;
            long atkWays = 4 * (k - 1) * (k - 2);
            long result = totWays - atkWays;
            System.out.println(result);
        }
    }
}
