package Oopspart1;

public class Car {

	
	int mod, wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car a = new Car();
Car b = new Car();
Car c = new Car();
a.mod = 2019;
a.wheel = 4;

b.mod = 2009;
b.wheel = 3;

c.mod = 2001;
c.wheel = 2;
System.out.println(a.mod);
System.out.println(a.wheel);

System.out.println(b.mod);
System.out.println(b.wheel);


a= b;
System.out.println(a.mod); // 2009
a.mod = 123;
System.out.println(a.mod); // 123
System.out.println(b.mod); // 123


	}

}
