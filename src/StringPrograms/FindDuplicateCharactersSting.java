package StringPrograms;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class FindDuplicateCharactersSting {

//	Duplicate Characters in : Learn Java Programming
//	  : 2
//	a : 4
//	g : 2
//	m : 2
//	n : 2
//	r : 3


	public static void main(String[] args) {

		// HashMap

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sting: ");
		String inputString = sc.nextLine();

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] array = inputString.toCharArray();

		for (char c : array) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("Duplicate Characters in : " + inputString);
		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}

	}
}
