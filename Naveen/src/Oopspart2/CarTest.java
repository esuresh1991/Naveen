package Oopspart2;

public class CarTest {

	public static void main(String[] args) {
		

		BMW b= new BMW(); // Static Polymorphsam  or Compile time Polymorphsam
		b.start();
		b.stop();
		b.refuel();
		b.theft();
		b.engine();
		
		System.out.println("************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.engine();
		
		System.out.println("************");
		
		//Top casting
		Car c1 = new BMW(); // Child class object can be reffered by parent class refereance variable, this is called  dynamic Polymorphsam or run time Polymorphsam
		c1.start();
		c1.stop();
		c1.engine();
		//c1.theft  - Cant be access the new method of child class using parent class refereance variable
		
		//Down casting
		//BMW b1 = (BMW)new Car(); // ClassCastException will come
		
	}

}
