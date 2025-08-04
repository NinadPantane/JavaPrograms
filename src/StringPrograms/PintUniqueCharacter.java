package StringPrograms;

import java.util.Scanner;

public class PintUniqueCharacter {

	/*
	 * Enter a string: Java Automation 
	 * Unique characters in "Java Automation": J a v  A u t o m i n
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = sc.nextLine();
		inputString=inputString.replaceAll("\\s+",""); // Remove Spaces
		uniqueCharacter(inputString);
	}

	public static void uniqueCharacter(String str) {

		// Assume ASCII characters (0-127), use boolean array to track character occurrences
		boolean[] unique = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!unique[ch]) {
				unique[ch] = true;
				System.out.print("Unique Character : "+ch + " ");
			}
		}
	}

}
