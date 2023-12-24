package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    // 2 3 5 8 9 10 11
    public static int[] find(int k, int n, int a[]) {
        Arrays.sort(a);
        int[] temp = new int[2];
        int s = 0;
        int e = n - 1;
        while (s < e) {
            if (k > a[e] + a[s]) {
                s++;
            } else if (k < a[e] + a[s]) {
                e--;
            } else if (k == a[e] + a[s]) {
                temp[0] = a[e];
                temp[1] = a[s];
                break;
            }
        }
        return temp;
    }

    public static void print(int temp[]) {
        for (int i = 0; i < 2; i++) {
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int temp[] = new int[2];
        temp = find(k, n, a);
        print(temp);

    }

}
