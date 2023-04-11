package april;

import java.util.Arrays;

public class SortString {
	// To sort a string alphabetically
	public static String sortString(String inputString)
	{
		// Converting input string to character array
		char tempArray[] = inputString.toCharArray();

		// Sorting temp array using
		Arrays.sort(tempArray);

		// Returning new sorted string
		return new String(tempArray);
	}

	// Main method
	public static void main(String[] args)
	{
		// Custom string as input
		String inputString = "pradeepkumar";
		String outputString = sortString(inputString);
		
		System.out.println("Input String : " + inputString);
		System.out.println("Output String : " + outputString);
	}
}

