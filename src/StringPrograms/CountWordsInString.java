package StringPrograms;

import java.util.Scanner;
public class CountWordsInString {
	
	/*
	 * Enter the String: Welcome to Java World
	 * Output->  Number of words in a string: 4
	 */

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String to count total number of words: ");
			String inputString=sc.nextLine();
			int wordCount = couuntwords(inputString);
			System.out.println("Number of words in a string: "+wordCount);
		}
		
	}

	public static int couuntwords(String inputString) {
		
		String array[]=inputString.split(" ");
		return array.length;
		
		
	}

}
