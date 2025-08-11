package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

				/* i/p
					array1 = {1, 2, 2, 3, 4};
					array2 = {2, 2, 3, 5};
				o/p -> Intersection of arrays: [2, 3]*/

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 2, 3, 5};
        int[] intersection = findIntersection(array1, array2);
        System.out.println("Intersection of arrays: " + Arrays.toString(intersection));
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }

        return intersection;
    }
}
