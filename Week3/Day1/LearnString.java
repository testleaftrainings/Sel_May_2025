package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		// String by Literal
		String name1 = "TestLeaf";

		String name2 = "TestLeaf";

		// String by Instantiation
		String name3 = new String("TestLeaf");

		String name4 = new String("TestLeaf");

		// .equals Compares the values of 2 Strings
		// == Compares the reference address of 2 Strings

		// .equals
		System.out.println(name1.equals(name2));

		// ==
		System.out.println(name1 == name2);

		System.out.println(name1 == name3);

		System.out.println(name3 == name4);

		String batchName = "May 2025";

		// length()
		int lengthOfString = batchName.length();
		System.out.println("The length is: " + lengthOfString);

		// contains() - compare the partial value
		System.out.println("The comparison is: " + batchName.contains("may"));

		// toUppercase
		String upperCase = batchName.toUpperCase();
		System.out.println(upperCase);

		String batch = "SelMay";
		// charAT - index
		char charAtIndex1 = batch.charAt(1);
		System.out.println(charAtIndex1);

		// toCharArray - String into a Character Array
		// 0 1 2 3 4 5
		// SelMay -{'S','e','l','M','a','y'}

		char[] charArray = batch.toCharArray();
		System.out.println(charArray[2]);

		// subString - Crop a String and returns the String in shorter string

		// 01234567
		String name = "Selenium";
		String substring = name.substring(2);
		System.out.println(substring);

		String substring2 = name.substring(1, 4);
		System.out.println(substring2);

		// split - Convert 1 String into multiple Strings

		// 0 1 2
		String word = "I am learning"; // {"I" , "am" , "learning"}
		String[] split = word.split(" ");
		System.out.println(split[1]);

		int rupee = 1000;
		String amount = "100";
		System.out.println(rupee + amount); // 1000100

		// parseInt - converts String into int
		int parseAmount = Integer.parseInt(amount);
		System.out.println(rupee + parseAmount);

		// replaceAll
		String amount1 = "1000$";
		String replaceAll = amount1.replaceAll("[$]", "Vineeth");
		System.out.println(replaceAll);

	}

}
