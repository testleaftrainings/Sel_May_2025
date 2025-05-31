package week2.day1;

public class Redmi {
	
	public String sentMessage() {
		return "Vineeth";
		}
	
	public static void main(String[] args) {
		Redmi redmiOptions=new Redmi();
		String sentMessage = redmiOptions.sentMessage();
		System.out.println(sentMessage);
	}

}
