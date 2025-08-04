package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class CommonElementsBetween2Arrays {
	/*
	 * Input Array 1 : [1, 2, 3, 4]
	 * Input Array 2 : [2, 3, 4, 5, 6] 
	 * Common Elements between Arrays : [2, 3, 4]
	 */

	public static void main(String[] args) {

		int array1[] = userInputIntegerArray();
		int array2[] = userInputIntegerArray();
	    
		Set<Integer> commonElements = findCommonElementsInArray(array1, array2);

		System.out.println("Input Array 1 : "+Arrays.toString(array1));
		System.out.println("Input Array 2 : "+Arrays.toString(array2));
		System.out.println("Common Elements between Arrays : "+ commonElements);

	}
	
	public static int[] userInputIntegerArray() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter length of Integer Array");
	    int length = sc.nextInt();

	    // create a String array to save user input
	    int[] input = new int[length];

	    // loop over array to save user input
	    System.out.println("Please enter Integer Array elements");
	    for (int i = 0; i < length; i++) {
	      int userInput = sc.nextInt();
	      input[i] = userInput;
	    }
		
		return input ;
	}

	public static Set<Integer> findCommonElementsInArray(int[] array1, int[] array2) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonSet = new HashSet<>();

		// Add all elements of first Array to Set 1
		for (int i : array1) {
			set1.add(i);
		}

		// Check for common elements in the second array
		for (int i : array2) {
			if (set1.contains(i)) {
				commonSet.add(i);
			}
		}
		return commonSet;
	}

}
