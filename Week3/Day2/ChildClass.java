package week3.day2;

//           SubClass
public class ChildClass extends ParentClass {

	public void takeHQPhoto() {
		System.out.println("High quality");

	}

	public static void main(String[] args) {
		ChildClass options = new ChildClass();
		options.takeHQPhoto();
		options.takePhoto();
	}

}
