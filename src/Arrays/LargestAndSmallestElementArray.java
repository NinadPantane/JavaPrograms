package Arrays;

import java.util.Arrays;

public class LargestAndSmallestElementArray {

	/*
	 * Input Array : [1, 2, 2, 3, 4, 6, 7, 7, 9]
	 * Smallest Element of Array : 1
	 * Largest Element of Array : 9
	 */
			
	public static void main(String []args) {
	int array[]= {7,2,4,6,3,7,2,9,1};
	
	
	  Arrays.sort(array);
	  System.out.println("Input Array : "+Arrays.toString(array));
	  
	  System.out.println("Smallest Element of Array : "+array[0]);
	  System.out.println("Largest Element of Array : "+array[array.length-1]);
	 
	}
}
