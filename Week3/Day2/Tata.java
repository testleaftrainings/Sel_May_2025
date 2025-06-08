package week3.day2;

public class Tata extends Car {
	
	public void highSpeed() {
		System.out.println("High speed");

	}
	
	public static void main(String[] args) {
		Tata tataOptions=new Tata();
		tataOptions.highSpeed();
		tataOptions.applyBrake();
		tataOptions.applyHorn();

	}

}
