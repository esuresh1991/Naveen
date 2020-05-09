package JavaBasics;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			Input();
		}
		
		static void Input()
		{
			int i = 100;
			
			for (int p = 1; p < i; p++) {
				
			boolean r = false;
			for (int J=2; J<p; J++) {
				if((p%J) == 0 ) {
					r = true;
					break;
				}
				
			}

		//	System.out.println(r);
		//	System.out.println(p);
			
			if(r == false)
			{
			System.out.println(p);
			}
		}
		}
	}
