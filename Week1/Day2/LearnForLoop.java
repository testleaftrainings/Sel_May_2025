package week1.day2;

public class LearnForLoop {
	public static void main(String[] args) {
		//Print numbers from 1 to 5
		//Starting number=1
		//Ending number =5
		// increment =1
		
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);   
		}
		
		System.out.println("----------");
		
		//Print numbers from 5 to 1
		//Starting point=5
		//Ending point =1
		// Decrement =1
		
		for(int i=5;i>=1;i--) {          
			//5  4  3  2  1
			System.out.println(i);
		}
	}
}
