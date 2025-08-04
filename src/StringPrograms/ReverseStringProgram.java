package StringPrograms;

import java.util.Scanner;

public class ReverseStringProgram {

	/*
	 * Revere string: Write a program to reverse a given string.
	 * 
	 * Input: This is a string 
	 * Output: gnirts a si sihT
	 */
	
	@SuppressWarnings("resource")
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be Reversed : ");
		String inputStr = sc.nextLine();
		
		String outputStr =ReverseString(inputStr);
		System.out.println("Reverse String is : "+outputStr);
		
	}

	public static String ReverseString(String inputStr) {
		
		String strReverse="";
		for(int i=0;i<inputStr.length();i++)
		{
			strReverse=inputStr.charAt(i)+strReverse;
		}
		
		return strReverse;
	}
	
}
