package week8.day1;

public class AccountDetails {

	private int accountNumber;

	public void set(int accountNumber) {
		this.accountNumber = accountNumber;

	}

	public int get() {
		return accountNumber;
	}

	public static void main(String[] args) {
		AccountDetails ac = new AccountDetails();
		System.out.println(ac.accountNumber);
	}

}
