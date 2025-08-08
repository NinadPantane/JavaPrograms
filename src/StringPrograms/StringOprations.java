package StringPrograms;

public class StringOprations {
	
	public static void main(String [] args) {
		//String is immutable.
		String name = "Ninad";
		name.toUpperCase();      // Looks like it's changing it...
		System.out.println(name); // Still prints "Ninad"
		
		String upper = name.toUpperCase(); // Now upper is "NINAD"
		System.out.println(upper); 
		
		
		// Use StringBuilder or StringBuffer if you're doing a lot of changes: To make it mutable 
		
		//StringBuilder is faster but not thread-safe
		StringBuilder sb = new StringBuilder("Ninad");
		sb.append(" Rocks");
		System.out.println(sb.toString());  // Ninad Rocks
		
		
		// Using StringBuffer : is thread-safe but slower.
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" World");
		System.out.println(sbf.toString());  // "Hello World"
		
		// Use :: StringBuilder. It’s simpler and faster (.append(), .insert(), .delete())
		
		StringBuilder sb1 = new StringBuilder("StringBuilder: ");
		sb1.append("append");
		System.out.println(sb1.toString());  // StringBuilder: append operation
		
		StringBuilder sb2 = new StringBuilder("StringBuilder");
		sb2.insert(0, "Insert ");
		System.out.println(sb2.toString());  // StringBuilder: insert operation
		
		StringBuilder sb3 = new StringBuilder("Delete StringBuilder");
		sb3.delete(0, 7);
		System.out.println(sb3.toString()); // StringBuilder: delete operation
		
	}

}
