package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDulicatesBySet {

	public static void main(String[] args) {
		// 0 1 2 3 4 5
		int[] numbers = { 3, 5, 2, 5, 6, 2 }; // 5,2

		Set<Integer> uniqueSet = new LinkedHashSet<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			uniqueSet.add(numbers[i]);
			// uniqueSet.add(numbers[0]); [3]
			// uniqueSet.add(numbers[1]); [3,5]
			// uniqueSet.add(numbers[2]); [3,5,2]
			// uniqueSet.add(numbers[3]); [3,5,2]
			// uniqueSet.add(numbers[4]); [3,5,2,6]
			// uniqueSet.add(numbers[5]); [3,5,2,6]
		}
		System.out.println("The current set is: " + uniqueSet);
	}

}
