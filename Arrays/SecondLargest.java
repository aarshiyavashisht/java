package Arrays;

import java.util.Scanner;

public class SecondLargest {

    public static void find(int n, int a[]) {

        int s = 0;
        int e = n - 1;
        int max = 0;
        int Maxmax = 0;
        for (int i = 0; i < n; i++) {

            Maxmax = Math.max(Maxmax, a[i]);
        }

        int SMax = 0;
        s = 0;
        e = n - 1;
        for (int i = 0; i < n; i++) {
            if (a[i] != Maxmax) {

                SMax = Math.max(SMax, a[i]);
            }
        }
        System.out.println(SMax);
        System.out.println(Maxmax);
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();

        }

        find(n, a);
    }

}
