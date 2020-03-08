package JavaBasics;

import Oopspart1.ThreeClass;


public class Firstclass {

	static int a=5;
	int c =5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecoundClass C =  new SecoundClass();
		SecoundClass.N();
		System.out.println(C.c + SecoundClass.a);
		
		Firstclass d =  new Firstclass();
		System.out.println(d.c+ a);
		M();
		b();
		ThreeClass C1 =  new ThreeClass();
		C1.N();
	
		
		
	}
	

	static void M()
	{
		int a = 123;
		System.out.println("M method"+ a);
	}
	
	static void b()
	{
		int a = 123;
		System.out.println("M method"+ a);
	}

}
