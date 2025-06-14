package week4.day1;

public class HDFC implements RBI {

	public void mandatoryKyc() {
		System.out.println("PAN card");

	}

	public void depositAmount() {
		System.out.println("5 L");

	}

	public static void main(String[] args) {
		HDFC hdfcOptions = new HDFC();
		hdfcOptions.mandatoryKyc();
		hdfcOptions.depositAmount();
	}

}
