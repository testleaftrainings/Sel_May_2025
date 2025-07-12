package week8.day1;

public class FetchDetails {
	public static void main(String[] args) {
		AccountDetails acc = new AccountDetails();
		acc.set(21);
		int number = acc.get();
		System.out.println(number);
	}

}
