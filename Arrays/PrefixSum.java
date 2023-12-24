package Arrays;

import java.util.Scanner;

public class PrefixSum {
	public static int[] PrefixSum(int[] prefixSum, int n) {
		int Sum = 0;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < 1) {
				Sum = 0;

			} else {
				Sum += prefixSum[i - 1];
			}
			temp[i] = Sum;
		}
		System.out.println("PREFIX SUM : ");

		for (int i = 0; i < n; i++) {

			System.out.print(temp[i] + " ");
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		PrefixSum(a, n);
	}
}
