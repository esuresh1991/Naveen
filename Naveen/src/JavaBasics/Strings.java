package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.apache.commons.text.diff.StringsComparator;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1 = "ZSS bb BB SS BB ss";
	//	a1 = a1.toLowerCase();
		String a2[] = a1.split(" ");
		ArrayList<String> a3 = new ArrayList<String>();
		for (int i = 0; i < a2.length; i++) {
			a3.add(a2[i]);
			}

	System.out.println(a3);	
	Collections.sort(a3);
	System.out.println(a3);	
	
	for (String a4 : a3) {
		System.out.println(a4);	
	}
		
		String Inp = "SS 22 SS";
		StringBuilder sb1=new StringBuilder(Inp);
		System.out.println(sb1);
		sb1.reverse();
		String out = sb1.toString();
			
		
		if(Inp.equals(out))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");

		
		System.out.println(out);
		
		String x = "01210";
	
		char y[] = x.toCharArray();
	
		char f[] = x.toCharArray();
		int q= 0;
for (int i = y.length-1; i >= 0; i--) {
	
	f[q] = y[i];
	q++;
	//System.out.print(y[i]);
} 

String z = new String(f);
String t = new String(y);
System.out.println(t);
System.out.println(z);

if(z.equals(t))
{
	System.out.println("Yes");
}
else
	System.out.println("No");


	}

}
