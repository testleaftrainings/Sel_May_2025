package week2.day1;

public class Access1 {
	public void depositMoney() {
		System.out.println("Money is deposited");

	}
	
	private void withdrawAmount() {
		System.out.println("Amount Withdraw");

	}
	
	public static void main(String[] args) {
		Access1 bankOptions=new Access1();
		bankOptions.depositMoney();
		bankOptions.withdrawAmount();
	}
	

}
