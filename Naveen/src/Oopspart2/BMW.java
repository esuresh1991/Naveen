package Oopspart2;

public class BMW extends  Car{

	public void start()  // Overrided method 
	{
		System.out.println("BMW start");
		super.start();
	}
	public void theft() {
		System.out.println("BMW Theft");
	}

}
