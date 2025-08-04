package NumberProgram;

import java.util.Scanner;
public class checkPalindromeNumber {

	/*
	 * originalNumber == reversedNumber 
	 * 121 == 121 -> Palindrome 
	 * 365 == 563 -> Not Palindrome
	 */
	
	public static void main(String []args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number to be Checked for Palindrome ");
		int number=sc.nextInt();
		
		int orignalNumber,temp,reverseNumber=0;
		
		orignalNumber=number;
		
		while(number>0) {
			temp=number%10;
			reverseNumber=reverseNumber*10+temp;
			number=number/10;
		}
		
		if(reverseNumber==orignalNumber) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}

}
