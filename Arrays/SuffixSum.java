package Arrays;

import java.util.Scanner;

public class SuffixSum {
    public static int[] SuffixSum(int[] suffixSum, int n) {
        int Sum = 0;
        int[] temp = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i > n - 2) {
                Sum = 0;

            } else {
                Sum += suffixSum[i + 1];
            }
            // System.out.println(temp[i]);
        }
        System.out.println("SUFFIX SUM");

        for (int i = 0; i < n; i++) {
            // System.out.println("SUFFIX SUM");
            System.out.print(temp[i] + "  ");
        }

        System.out.println();
        return temp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        SuffixSum(a, n);

    }
}
