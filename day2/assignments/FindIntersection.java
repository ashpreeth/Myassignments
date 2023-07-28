package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// Array Declaration
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		// Finding array length
		int alength = a.length;
		int blength = b.length;
		// To iterate inside array elements
		for (int i = 0; i < alength; i++) {
			for (int j = 0; j < blength; j++) {
				// To compare the arrays
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
