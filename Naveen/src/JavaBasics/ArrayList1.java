package JavaBasics;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		
		System.out.println(al.size());
		al.add(300);
		al.add(400);
		
		System.out.println(al.size());
		
		al.add("test");
		al.add('a');
		System.out.println(al.size());
		
		System.out.println(al.get(3));
		
		for(int i=0; i<al.size() ; i++) {
			
			System.out.println(al.get(i));
		}
		
		System.out.println("*********************");
		al.remove(1);
		
		System.out.println(al.size());
for(int i=0; i<al.size() ; i++) {
			
			System.out.println(al.get(i));
		}
		
		
		
ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(100);
		al1.add(200);
		//al1.add("sdsde"); Only Int can be added
		System.out.println(al1.size());
				
for(int i=0; i<al1.size() ; i++) {
			
			System.out.println(al.get(i));
		}
		
		
		
	}
	
}
