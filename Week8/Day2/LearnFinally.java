package week8.day2;

public class LearnFinally {

	public static void main(String[] args) {
		try {
			int arr[]= new int[-3];
			System.out.println(arr[3]);
		}
	catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The exception is :"+e);
	}
		
		finally {
		System.out.println("Report for the execution");
		}
	}

}
