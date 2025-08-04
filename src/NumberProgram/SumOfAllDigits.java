package NumberProgram;

import java.util.Scanner;
public class SumOfAllDigits {

 
	/*
	 * i/p = 456 
	 * Sum of the entered digit is: 15 (Logic -> 4+5+6)
	 */
		
	public static void main(String []args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number for calculating its sum of digit: ");
		int  number=sc.nextInt();
		
		int temp,sumofDigits=0;
		
		while(number>0) {
			
			temp=number%10; // Extract the last digit
			sumofDigits=sumofDigits+temp; // Add the digit to sum number
			number=number/10; // Remove the last digit from number
		}
		
		System.out.println("Sum of the entered digit is: "+sumofDigits);
		
		
	}
}
