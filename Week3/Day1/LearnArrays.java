package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// Array by Literal

		// 0 1 2 3 4
		int[] marks = { 76, 81, 73, 100, 90 };

		// To find the number of data - length()
		int lengthOfArrays = marks.length;
		System.out.println("The Length is :" + lengthOfArrays);

		// To retrieve the data - 1 data -index
		System.out.println("The data at index 2: " + marks[4]);

		// To retrieve all data
		// 0 1 2 3 4 5
		for (int i = 0; i < lengthOfArrays; i++) {
			System.out.println(marks[i]);
			// System.out.println(marks[0]); 76
			//// System.out.println(marks[1]); 81
			// System.out.println(marks[2]); 73
			// System.out.println(marks[3]); 100
			// System.out.println(marks[4]); 90

		}

		// To sort in Ascending order
		Arrays.sort(marks);
        // int[] marks= {73,76,81,90,100};
		
		// To find the lowest value
		System.out.println("The lowest number is: " + marks[0]);

		// Highest number marks[4]
		System.out.println(marks[lengthOfArrays - 1]);

		// Array by Instantiation

		int[] scores = new int[3];
		scores[0] = 65;
		scores[1] = 75;
		scores[2] = 85;
    }
}