package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortInBuildFunctions {

	public static void main(String[] args) {
		
		// Arrays.sort() - for sorting array in accessing order
		int[] array1 = { 30, 20, 40, 10 };
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

    	// Collections.reverseOrder() - for sorting array in Descending order
        // NOTE - This is work only with Object Type "Integer" and will not work with primitive  Type "int"
		Integer[] array2 = { 300, 200, 400, 100 };
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println(Arrays.toString(array2));
	}

}
