package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String B = "Hi how are you";
		String A = B.toLowerCase();
		
		String b[] = A.split(" ");
		A.toLowerCase();
		ArrayList<String> c = new ArrayList<String>();
		System.out.println(b.length);
		for(int i=0;i < b.length; i++)
		{
			c.add(b[i]);
						
		}
		System.out.println(c);
		
		Collections.sort(c);
		
		System.out.println(c);
		
		for(String E : c) {
			System.out.println(E);
		}
	}

}
