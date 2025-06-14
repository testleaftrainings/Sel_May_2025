package week4.day1;

public class AxisImplementation extends Axis {

	public void depositAmount() {
		System.out.println("20 L");
		
	}

	public void houseLoan() {
		System.out.println("50 L");
		
	}
	
	public void carLoan() {
		//super.carLoan();
		System.out.println("50 L");
	}
	
	public static void main(String[] args) {
		AxisImplementation axisOptions=new AxisImplementation();
		axisOptions.depositAmount();
		axisOptions.houseLoan();
		axisOptions.mandatoryKyc();
		axisOptions.carLoan();
	}
}
