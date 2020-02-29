package Oopspart1;

public class LocalandGlobal {
	
	int global = 10, g1 = 20; // Global/ Call variable

	public static void main(String[] args) {
	
		int local = 30, l1 = 40; // local variable
		System.out.println(local + l1);
		
		LocalandGlobal obj  = new LocalandGlobal(); // Non static variable can be accessed via object
		System.out.println(obj.g1 + obj.global);
		System.out.println(obj.g1 + obj.global+ obj.Local());		
		
	}
	
	public int Local()
	{
		int l3 = 60; //Local
		int l4  = global + l3; 
		return l4;
	}

}
