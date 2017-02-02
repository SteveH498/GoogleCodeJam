package africa2010b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseWords {

	public String reverseWords(String s) {
		
		String[] words =  s.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i = ( words.length - 1); i >= 0 ; i--){
			sb.append(words[i]);
			if(i != 0){
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		ReverseWords rw = new ReverseWords();

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int numOfTestCases = in.nextInt();
		in.nextLine(); // Discard '\n'

		int k = 0;
		while (k < numOfTestCases) {

			String s = in.nextLine();
			String reversedWords = rw.reverseWords(s);
			
			System.out.println("Case #"+(k+1)+": " + reversedWords);

			k++;
		}	
		in.close();
	}

}
