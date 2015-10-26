/**
 * BasicArray.java  10/26/2015
 *
 * Demonstrates basic array declaration and use
 *
 */

public class BasicArray {
	public static void main(String[] args) {
		//------------------------------------------------------------
		// Creates an array, fills it with various integer values,
		// modifies one value, then prints them out
		//------------------------------------------------------------

		final int LIMIT = 15;

		// Declaring my array
		int[] list = new int[LIMIT];


		// Initialize the array values
		for (int index = 0;index < LIMIT;index++) {
			list[index] = index * 10;
		}

		list[5] = 999;

		// Print the array values
		for (int index = 0;index < LIMIT;index++) {
			System.out.println(list[index]);
		}
	}
}