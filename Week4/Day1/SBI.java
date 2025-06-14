package week4.day1;

public class SBI implements RBI {

	public void goldLoan() {
		System.out.println("5%");

	}

	public void mandatoryKyc() {
		System.out.println("Aadhar card");
	}

	public void depositAmount() {
		System.out.println("10 L");

	}

	public static void main(String[] args) {
		SBI sbiOptions = new SBI();
		sbiOptions.mandatoryKyc();
		sbiOptions.depositAmount();

	}

}
