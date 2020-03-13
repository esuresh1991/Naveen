package JavaBasics;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a(371);

	}
	
	static void a(int z)
	{
		int tmp = z;
		int x =0;
		int c =0;
		
		while(z>0)
		{
			x = z%10;
			c = (x*x*x)+c;
			z=z/10;
		}
		
		if(c==tmp)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
