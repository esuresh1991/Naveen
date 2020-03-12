package JavaBasics;

public class Prime {

	public static void main (String A[])
	{
		int w=Integer.parseInt(A[0]);  
		Input(w);
	}
	
	static void Input(int q)
	{
		int i = q;
		
		boolean r = false;
		for (int J=2; J<i; J++) {
			if((i%J) == 0 ) {
				r = true;
				break;
			}
			
		}
		System.out.println(r);
	}
	

}
