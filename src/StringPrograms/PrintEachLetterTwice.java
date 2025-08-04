package StringPrograms;

import java.util.Scanner;
public class PrintEachLetterTwice {

	/*
	 * Enter a string: hello 
	 * Doubled characters: hheelllloo
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		StringBuilder doubledCharacter = new StringBuilder();

		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			doubledCharacter.append(ch).append(ch);
		}
		
		System.out.println(doubledCharacter.toString());

	}

}
