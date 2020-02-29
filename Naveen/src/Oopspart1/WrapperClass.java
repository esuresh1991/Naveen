package Oopspart1;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  i = "100";
		
		System.out.println(i + 20);

		//String to Int conversion
		
		int a= Integer.parseInt(i);
		System.out.println(a + 20);
		
		//String to double conversion
		
		String  j = "12.33";
		double b=Double.parseDouble(j);
		System.out.println(b + 1.33);
		
		//String to boolean conversion
		
		String  k = "true";
		boolean l = Boolean.parseBoolean(k);
		System.out.println(l);
		
		
		//int to string conversion
		
		int m = 200;
		String o = Integer.toString(m);
		System.out.println(o);
		
			
	}

}
