package africa2010a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StoreCredit {

	private int credit;
	private int numberOfItems;
	private int[] items;

	public StoreCredit(int credit, int numberOfItems, int[] items) {
		super();
		this.credit = credit;
		this.numberOfItems = numberOfItems;
		this.items = items;
	}

	public int[] getCreditIndices() {
		int[] indices = new int[2];
		for (int i = 0; i < this.numberOfItems; i++) {
			indices[0] = (i + 1);
			for (int j = (i + 1); j < this.numberOfItems; j++) {
				if ((items[i] + items[j]) == credit) {
					indices[1] = (j + 1);
					return indices;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int numOfTestCases = in.nextInt();

		int k = 0;
		while (k < numOfTestCases) {

			int credit = in.nextInt();
			
			int numberOfItems = in.nextInt();

			int[] items = new int[numberOfItems];
			for (int i = 0; i < numberOfItems; i++) {
				items[i] = in.nextInt();
			}

			StoreCredit sc = new StoreCredit(credit, numberOfItems, items);
			int[] resultIndices = sc.getCreditIndices();

			System.out.println("Case #" + (k + 1) + ": " + resultIndices[0] + " " + resultIndices[1]);

			k++;
		}
		in.close();
	}

}
