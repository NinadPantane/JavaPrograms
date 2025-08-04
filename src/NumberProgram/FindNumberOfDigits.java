package NumberProgram;

import java.util.Scanner;
public class FindNumberOfDigits {


	/*
	 * i/p = 4566 
	 * o/p -> Total Digit Count of Entered Number = 4
	 */
		
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number= sc.nextInt();
		
		int temp,digitCount=0;
		
		while(number>0) {
			temp=number%10;
			if(temp>=0) {
				digitCount++;
			}
			number=number/10;
		}
		
		System.out.println("Total Digit Count of Entered Number = "+digitCount);
	}
}
