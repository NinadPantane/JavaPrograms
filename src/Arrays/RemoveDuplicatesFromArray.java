package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int array[] = userInputIntegerArray();

		// Create Set = Set stores unique elements automatically - Pass the array elements into Set 
		Set<Integer> uniqueElements= new HashSet<Integer>();
		for(int i:array) {
			uniqueElements.add(i);
		}
		
		System.out.println(uniqueElements);
	}

	public static int[] userInputIntegerArray() {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of Integer Array : ");
		int length=sc.nextInt();
		
		int inputArray[]=new int[length];
		System.out.println("Enter the Integer Array Elements: ");
		for(int i=0;i<length;i++) {
			int num=sc.nextInt();
			inputArray[i]=num;
		}
		return inputArray;
	}
	
	
}
