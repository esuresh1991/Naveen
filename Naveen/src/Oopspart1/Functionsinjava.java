package Oopspart1;

public class Functionsinjava {
	
	public static void main(String[] args) {
	
		Functionsinjava obj = new Functionsinjava();
		obj.test();
		
		int a = obj.test1();
		System.out.println(a);
		
		int b =  obj.test2(3,2);
		System.out.println(b);
		
	}
	
	public void test() {
	System.out.println("no return method");	
	}
	
	public int test1() {
		System.out.println("return method");
		int a = 100;
		return a;
	
		}
	
	public int test2(int x, int y) {
		System.out.println("getting input and return method");
		int a = x+y;
		return a;
	
		}
	
}
