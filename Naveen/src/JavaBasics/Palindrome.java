package JavaBasics;

public class Palindrome {

	static void P(int a)
	{
		int z=0;
		int x=0;
		int tmp = a;
		
		while(a>0) {
			z = a%10;
			x = (x*10)+z;
			a = a/10;
		}
		
		if(tmp==x)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
P(02120);
	}

}
