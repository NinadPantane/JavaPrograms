package NumberProgram;

import java.util.Scanner;

public class FactorialNumber {

//	Input: 5!
//	Output: 5! = 5*4*3*2*1 = 120

	public static void main(String [] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number for which the program would give its Factorial Value: ");
			int number = sc.nextInt();
			int result = factorial(number);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("Program Error : Please enter a valid number to get its factorial value");
		}
		
	}
	
	public static int factorial(int numb) {
		int factorailnumber = 1;
		for(int i=1;i<=numb;i++)
		{
			factorailnumber=factorailnumber*i;
		}
		
		return factorailnumber;
	}
}
