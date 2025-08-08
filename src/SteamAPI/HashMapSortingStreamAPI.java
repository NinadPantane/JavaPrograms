package SteamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortingStreamAPI {

	public static void main(String[] args) {

        // Step 1: Create a sample HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Charlie");
        map.put(2, "Alice");
        map.put(3, "Eve");
        map.put(4, "Bob");

        System.out.println("Original Map: " + map);

        // Step 2: Sort by value (ascending)
        LinkedHashMap<Integer, String> sortedByValue = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue()) // ascending order
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,        // merge function (not really needed here)
                LinkedHashMap::new     // preserve insertion order
            ));

        System.out.println("Sorted by Value (Ascending): " + sortedByValue);

        // Step 3: Sort by value (descending)
        LinkedHashMap<Integer, String> sortedByValueDesc = map.entrySet().stream()
            .sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        System.out.println("Sorted by Value (Descending): " + sortedByValueDesc);
    }
}
