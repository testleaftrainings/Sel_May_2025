package week8.day2;

public class LearnThrow {

	public static void main(String[] args) {
		int age=-18;
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("not eligible");
		}
if (age<=0) {
	throw new ArithmeticException("Age is Negative");
}
	}

}
