package NumberProgram;

import java.util.Scanner;
public class FibonacciSeries{
	
	/*
	 * Input: N = 10 Output: 0 1 1 2 3 5 8 13 21 34 Explanation: Here, first term of
	 * Fibonacci is 0 and second is 1, so that 3rd term = first(o) + second(1) etc
	 * and so on.
	 */
	public static void main(String []args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of Fibonacci Series ");
		int fiboLength=sc.nextInt();
		
		int n1=0;
		int n2=1;
		
		// Printing Fibonacci Series
		
		for(int i=0;i<fiboLength;i++)
		{
			System.out.print(n1 + " ");
			
			// swap 
			int n3= n1+n2;
			n1=n2;
			n2=n3;
		}
		
	}
}