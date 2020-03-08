package Oopspart2;

public class thiskey {

	int a;
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskey obj = new thiskey();
		  obj.setData(2,3);
	
		  thiskey obj1 = new thiskey(10);	 
		   
	}

	public thiskey()
	{

	
		System.out.println("cons");
		
		
	}
	public thiskey(int x)
	{
		this();
		System.out.println("cons"+ x);
		
	}
	
	
	public void setData(int a ,int b){
		  this.a = a;
		  this.b = b;
		 }
		 public void showData(){
			   

		   System.out.println("Value of A ="+a);
		   System.out.println("Value of B ="+b);
		  
		 }
	
}
