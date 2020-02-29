package Oopspart1;

public class StaticAndNonStatic {

	String s1 = "non Static";
	static String s2 = "Static";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(s2);
		Static();
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.s1);
		obj.Nstatic();
		
		obj.Static();
		
	}
	
	public void Nstatic() {
		System.out.println("Non static");
	}
	
	public static void Static() {
		System.out.println("static");
	}

	
}
