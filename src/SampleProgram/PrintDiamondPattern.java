package SampleProgram;

public class PrintDiamondPattern {

	/*
	 *
	 * Write a Program to Print Pyramid Pattern in Java as shown below 
		
			 *
		    ***
		   *****
		  *******
		 *********
		***********
		 *********
		  *******
		   *****
		    ***
		     *
	
	 *
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int n = 6; // height of the top half

	        // Top half
	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Bottom half
	        for (int i = n - 1; i >= 1; i--) {
	            // Print leading spaces
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
