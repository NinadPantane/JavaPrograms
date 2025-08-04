package SampleProgram;

public class PrintPyramidPattern {

	/*
	 *
	 * Write a Program to Print Pyramid Pattern in Java as shown below 
		
		*
	   ***
	  *****
   	 *******
	
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 4; // You can change this to print more rows

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars: 2*i - 1 stars in each row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
		
		
	}

}
