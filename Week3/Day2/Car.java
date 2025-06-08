package week3.day2;

public class Car extends Vehicle {
	
	public void applyHorn() {
		System.out.println("Horn applied");

	}
	
	public static void main(String[] args) {
		Car carOptions=new Car();
		carOptions.applyBrake();
		carOptions.applyHorn();
	}

}

