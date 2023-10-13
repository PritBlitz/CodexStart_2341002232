import java.util.Scanner;
public class Q2_1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seq = scanner.nextLine();

        if (!seq.matches("[ACGT]+")) {     // regex pattern-matching
            // [ACGT] : expression defines a character class that matches any one character from the set and ensures that one of the characters at that position is one of the valid DNA bases
            // + : ensures that there is at least one valid DNA base character
            System.out.println("Invalid ! . The input should only contain 'A', 'C', 'G', and 'T'.");
            return;
        }

        int maxRep = 1;
        int curRep = 1;
        for (int i = 1; i < seq.length(); i++) {
            if (seq.charAt(i) == seq.charAt(i - 1)) {
                curRep++;
            } else {
                curRep = 1;
            }

            if (curRep > maxRep) {
                maxRep = curRep;
                // maxRep updated
            }
        }
        System.out.println(maxRep);    // longest repetition
    }
}
