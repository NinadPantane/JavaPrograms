package SampleProgram;

public class PrintLeardersInArray {

	public static void main(String[] args) {
		
		/*
		 * Write a program to print all the LEADERS in the array. An element is leader
		 * if it is greater than all the elements to its right side. And the rightmost
		 * element is always a leader. For example int the array {16, 17, 4, 3, 5, 2},
		 * leaders are 17, 5 and 2. Let the input array be arr[] and size of the array
		 * be size.
		 */
		 

		int arr[]= {16, 17, 4, 3, 5, 2};
        int size = arr.length;
       
		int rightMostElement = arr[size-1];
		
		 System.out.print(rightMostElement+" ");
		
		for(int i=size-2;i>=0;i--) {
			
			  if(arr[i]>rightMostElement) 
			  {
				  rightMostElement=arr[i];
				  System.out.print(rightMostElement+" ");
			  }
			
		}
			
	}

}
