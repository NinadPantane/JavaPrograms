package SteamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		List<String> names = List.of("Alice", "Bob", "Charlie", "David");

		List<String> filtered = names.stream().filter(name -> name.startsWith("C")).map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(filtered); // [CHARLIE]

		// Find all the even numbers from the List
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 17, 03, 27, 3, 4, 5, 31, 8);
		List<Integer> evens = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(evens);

		// Find the Second Highest Number in a List

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 6, 3, 2, 2, 1, 2, 7);
		Set<Integer> uniqueNames = new HashSet<>(numbers);
		Optional<Integer> secondHighest = uniqueNames.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(secondHighest);

		// Remove duplicates from a list of simple values

		List<String> nameslist = List.of("Alice", "Bob", "Alice", "Eve");

		List<String> uniqueNamesList = nameslist.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNamesList); // [Alice, Bob, Eve]

		// Process an existing HashMap with Streams

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Alice");
		map.put(2, "Bob");
		map.put(3, "Anna");

		Map<Integer, String> filteredMap = map.entrySet().stream().filter(e -> e.getValue().startsWith("A"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(filteredMap); // {1=Alice, 3=Anna}

	}

}
