package Arrays;

import java.util.*;

public class ArrarySorting {
	
	/* Take Array Input from the User
	 * Input Array : [4, 2, 1, 3] 
	 * Sorted Array in Ascending Order : [1, 2, 3, 4]
	 * Sorted Array in Descending Order : [4, 3, 2, 1]
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Integer Array: ");
		int length = sc.nextInt();

		int inputArray[] = new int[length];
		System.out.println("Enter the Integer Arrary Elements: ");
		for (int i = 0; i < length; i++) {
			int userInput = sc.nextInt();
			inputArray[i] = userInput;
		}

		System.out.println("Input Array : " + Arrays.toString(inputArray));

		sortedArrayAscendingOrder(inputArray);
		sortedArrayDescendingOrder(inputArray);
	}

	public static void sortedArrayAscendingOrder(int[] array) {

		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array in Ascending Order : " + Arrays.toString(array));
	}

	private static void sortedArrayDescendingOrder(int[] array) {

		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array in Descending Order : " + Arrays.toString(array));

	}
}
