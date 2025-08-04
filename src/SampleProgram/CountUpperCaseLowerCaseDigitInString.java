package SampleProgram;

import java.util.Scanner;
public class CountUpperCaseLowerCaseDigitInString {

	/*
	 * input Sting = abc123!@# ABC 
	 * Following are the Character Count 
	 * Total Upper Case Characters: 3 
	 * Total Lower Case Characters: 3 
	 * Total Digits Characters: 3 
	 * Total Special Characters: including Space: 4
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sting for Count for Upper Case Lower Case and Digit in the String : ");
		String str=sc.nextLine();
		int upperCaseCounter=0;
		int lowerCaseCounter=0;
		int digitCounter=0;
		int specialCharacterCounter=0;
		
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(Character.isUpperCase(array[i]))
			{
				upperCaseCounter++;
			}
			else if(Character.isLowerCase(array[i])) {
				lowerCaseCounter++;
			}
			else if (Character.isDigit(array[i])) {
				digitCounter++;
			}
			else {
				specialCharacterCounter++;
			}
		}
		
		System.out.println("Following are the Character Count"
				+ "\n"+"Total Upper Case Characters: "+upperCaseCounter
				+ "\n"+"Total Lower Case Characters:: "+lowerCaseCounter
				+ "\n"+"Total Digits Characters:: "+digitCounter
				+ "\n"+"Total Special Characters: including Space: "+specialCharacterCounter
				);
				
		
	}

}
