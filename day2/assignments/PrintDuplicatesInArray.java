package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array declaration
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		// Getting array length/size
		int length = arr.length;
		int count;
		// Outer loop
		for (int i = 0; i < length - 1; i++) {
			// count =0;
			// Inner Loop
			for (int j = i + 1; j < length; j++)
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

		}
	}
}
