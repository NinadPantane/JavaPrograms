package NumberProgram;

import java.util.Scanner;
public class ResverseNumber {

//	Input: 15786
//	Output: 68751

	
	public static void main(String [] args) {
	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be Reversed: ");
		int number=sc.nextInt();
		
		int temp,reveseNumb=0;
		
		while(number>0) {
		temp = number%10;
		reveseNumb=reveseNumb*10+temp;
		number = number/10;
		}
		
		System.out.println("Reverse Number is "+reveseNumb);
	
	}
}
