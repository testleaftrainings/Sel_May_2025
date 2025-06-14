package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Declaring a List
		List<String> learnersList = new ArrayList<String>();
		System.out.println("The empty list is: " + learnersList);

		// add an element
		learnersList.add("venkatesh");
		System.out.println("List after adding 1 element: " + learnersList);

		// add
		learnersList.add("Rajesh");
		learnersList.add("Bharat");
		learnersList.add("Arun");
		System.out.println("List after adding multiple element: " + learnersList);

		learnersList.add(1, "Selvi");
		System.out.println("List after adding by index: " + learnersList);

		// Add the duplicate values
		learnersList.add("Bharat");
		System.out.println("List after adding duplicates: " + learnersList);

		// Remove an element
		// learnersList.remove(3);
		learnersList.remove("Bharat");
		System.out.println("List after removing element: " + learnersList);

		// To get a particular -get
		String elementAtIndex2 = learnersList.get(2);
		System.out.println("The element is: " + elementAtIndex2);

		// sort
		Collections.sort(learnersList);
		System.out.println("The List after sorting: " + learnersList);

		// Add all the elements for one list to another
		List<String> employees = new ArrayList<String>();
		System.out.println("The list is: " + employees);
		employees.addAll(learnersList);
		System.out.println("The current employees list is: " + employees);

		int size = employees.size();
		System.out.println("The size is: " + size);

		// Clear all the elements from learners
		learnersList.clear();
		System.out.println("The list is: " + learnersList);
	}
}
