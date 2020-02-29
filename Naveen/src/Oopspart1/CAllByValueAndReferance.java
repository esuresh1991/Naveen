package Oopspart1;

public class CAllByValueAndReferance {

	int p ,q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CAllByValueAndReferance obj = new CAllByValueAndReferance();
		int a = 10, b = 20;
		obj.sum(a, b); // call by value OR pass by value 
		System.out.println(obj.sum(a, b));
		
		obj.p = 50;
		obj.q = 60;
		System.out.println(obj.p);
		System.out.println(obj.q);		
		
		obj.swap(obj);

		//After swap
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		}

	public int sum(int x,int y)
	{
		x = 30;
		y = 30;
		int c = x+y;
		return c;
		
	}
	
	public void swap(CAllByValueAndReferance t)  // Call by reference
	{
		int temp = t.p;
		t.p =t.q;
		t.q = temp;
				
	}
}
