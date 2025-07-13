package week8.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int number=10;
		try {
			System.out.println(number/0);
			
		}
		catch (ArithmeticException e) {
			System.out.println("The exception is "+e);
		}
		
		try {
			int arr[]= new int[-3];
			System.out.println(arr[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The exception is :"+e);
		}
		catch (Exception e) {
			
		}
		
		System.out.println("Code completed");

	}

}
