package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Declare a set
		// Set<String> mentors=new HashSet<String>();
		// Set<String> mentors=new TreeSet<String>();
		Set<String> mentors = new LinkedHashSet<String>();
		System.out.println("The empty set: " + mentors);

		// add elements
		mentors.add("Vinoth");
		mentors.add("Bhuvanesh");
		mentors.add("Harrish");
		mentors.add("Muthu");
		System.out.println("The Set is: " + mentors);

		// Add duplicate
		mentors.add("Harrish");
		System.out.println("The set after adding dulicate: " + mentors);

		// Remove an element
		mentors.remove("Harrish");
		System.out.println("The set after removing: " + mentors);

		// To count the number of elements
		int setSize = mentors.size();
		System.out.println("The size of the set: " + setSize);

		// Convert set into list
		List<String> trainers = new ArrayList<String>(mentors);
		System.out.println("The trainers list is: " + trainers);
	}
}
