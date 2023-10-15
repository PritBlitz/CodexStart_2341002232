/*
    * NAME : PRITISH BISWAS 
    * CSES - GRAY CODE 
    * LINK : https://cses.fi/problemset/task/2205
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q4_2205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> grayCode = new ArrayList<>();
        // reversing and appending
        grayCode.add("");
        for (int i = 0; i < n; i++) {
            int size = grayCode.size();
            for (int j = size - 1; j >= 0; j--) {
                grayCode.add(grayCode.get(j));
            }
            size *= 2;
            for (int j = 0; j < size; j++) {
                if (j < grayCode.size() / 2) {
                    grayCode.set(j, grayCode.get(j) + "0");
                } else {
                    grayCode.set(j, grayCode.get(j) + "1");
                }
            }
        }
        for (String code : grayCode) {
            System.out.println(code);   // gray code
        }
    }
}

