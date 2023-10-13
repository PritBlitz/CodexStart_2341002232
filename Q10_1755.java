import java.util.Scanner;

public class Q10_1755 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 0;
        boolean[] check = new boolean[26];
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!check[c - 'A']) {
                check[c - 'A'] = true;
                count++;
            } else {
                result.append(c);
                check[c - 'A'] = false;
                count--;
            }
        }

        if (count >= 2) {
            System.out.println("NO SOLUTION");
            return;
        }

        System.out.print(result);

        for (char c = 'A'; c <= 'Z'; c++) {
            if (check[c - 'A']) {
                System.out.print(c);
            }
        }

        System.out.print(result.reverse());
    }
}
