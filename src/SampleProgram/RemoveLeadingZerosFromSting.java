package SampleProgram;

public class RemoveLeadingZerosFromSting {

	/*
	 * Input : 00000123569 Output : 123569
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String input = "0000123569";

        // Remove leading zeros using regex
        String output = input.replaceFirst("^0+(?!$)", "");
        
		/*
		 * ^0+ matches one or more zeros at the beginning of the string.
		 * 
		 * (?!$) is a negative lookahead to avoid removing all zeros if the string is just "0".
		 */

        System.out.println("Output : " + output);
		
	}

}
