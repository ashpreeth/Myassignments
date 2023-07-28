package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array declaration
		int[] data = { 3, 2, 11, 4, 6, 7 };
		// Ascending order
		Arrays.sort(data);
		// Getting the array length
		int arrlength = data.length;
		// Second Largest Number
		System.out.println(data[arrlength - 2]);

	}

}
