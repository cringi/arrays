/**
 * ReverseOrder.java  10/26/2015
 *
 *
 *Demonstrates array index processing.
 *
 */

import java.util.Scanner;

public class ReverseOrder {
	//-------------------------------------------------------------------
	// Reads a list of numbers from the user, storing them in an array,
	// then prints them in opposite order
	//-------------------------------------------------------------------
	public static void main(String[] args) {
		double[] numbers = new double[10];

		Scanner bobTheBuilder = new Scanner(System.in);
		System.out.println("The size of the array: " + numbers.length);

		for (int index = 0;index < numbers.length;index++) {
			System.out.print("Enter number " + (index + 1) + ": ");
			numbers[index] = bobTheBuilder.nextDouble();
		}

		System.out.println("The numbers in reverse order: ");

		for (int index = numbers.length - 1;index >= 0;index--) {
			System.out.println(numbers[index] + " ");
		}
	}
}