package Oopspart1;

public class MethodOverloading {

	
	
public static void main(String[] args) {
		
		MethodOverloading obj  = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		obj.sum("suresh");
		obj.sum(10, "suresh");
		System.out.println(obj.sum(10, "iop"));
	}
	

public static void main(int a) {
	
	MethodOverloading obj  = new MethodOverloading();
	obj.sum();
	obj.sum(10);
	obj.sum(10,30);
	obj.sum("qwe");
	
}
	
	public void sum()
	{
		System.out.println("zero parameter");
	}
	
	public void sum(int i)
	{
		System.out.println("1 parameter"+ i);
	}
	
	public void sum(int i, int j)
	{
		System.out.println("2 parameter" + i + j);
	}
	
	public void sum(String i)
	{
		System.out.println("2 parameter "+ i);
	}
	
	public String sum(int a, String e)
	{
		String b = a+e;
		System.out.println(b);
		return b;
	}
	
}
