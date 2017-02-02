package codejam2008round1a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumScalarProduct {

	public long calcMinScalarProduct(int numberOfIntegers, long[] v1, long[] v2) {
		Arrays.sort(v1);
		Arrays.sort(v2);

		long minScalarProduct = 0;
		for (int i = 0; i < numberOfIntegers; i++) {
			minScalarProduct += (v1[i] * v2[numberOfIntegers - 1 - i]);
		}

		return minScalarProduct;
	}

	public static void main(String[] args) {
		MinimumScalarProduct msp = new MinimumScalarProduct();
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int numberOfTestCases = in.nextInt();

		int testCase = 1;
		while (testCase <= numberOfTestCases) {

			int numberOfIntegers = in.nextInt();
			in.nextLine(); // Discard '\n'

			String l1 = in.nextLine();
			String l2 = in.nextLine();

			String[] v1 = l1.split(" ");
			String[] v2 = l2.split(" ");

			long minScalarProduct = 0;
			if (v1.length == numberOfIntegers && v2.length == numberOfIntegers) {
				long[] vi1 = new long[numberOfIntegers];
				long[] vi2 = new long[numberOfIntegers];

				for (int i = 0; i < numberOfIntegers; i++) {
					vi1[i] = Long.parseLong(v1[i]);
					vi2[i] = Long.parseLong(v2[i]);
				}

				minScalarProduct = msp.calcMinScalarProduct(numberOfIntegers, vi1, vi2);
			}

			System.out.println("Case #" + testCase + ": " + minScalarProduct);

			testCase++;
		}

		in.close();
	}

}
