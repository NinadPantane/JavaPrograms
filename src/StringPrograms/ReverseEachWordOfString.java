package StringPrograms;

import java.util.Scanner;
public class ReverseEachWordOfString {

	/*
	 * Input: Java is good programming langauge
	 * Output: avaJ si doog gnimmargorp eguagnal
	 */
	
	public static void main(String []args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String str=sc.nextLine();
		
		String words[]=str.split(" "); // Created a String Array to split each words
		String reverseString="";
		
		for(int i=0;i<words.length;i++) 	// loop through each words
		{
		String word=words[i];
		String reverseWord="";
		for(int j=0;j<word.length();j++) {		// loop through character of the word to reverse them
			reverseWord=word.charAt(j)+reverseWord;
		}
		reverseString=reverseString+reverseWord+" "; // Add all Reversed Words in the Reverse Sting
		}
		
		System.out.println(reverseString);
		
		
	}
}
