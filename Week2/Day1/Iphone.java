package week2.day1;

public class Iphone {
	public void makePayment(int number, String name, boolean status) {
		System.out.println(number);
		System.out.println(name);
}
	public static void main(String[] args) {
		Iphone iphoneOptions=new Iphone();
		iphoneOptions.makePayment(7, "Vineeth", false);
		}
}
