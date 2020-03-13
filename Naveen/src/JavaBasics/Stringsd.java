package JavaBasics;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;;

public class Stringsd {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		Str("Hello world");
	}
	
	public static void Str(String Inp)
	{
		String s1="hello world"; 
		char[] ch=s1.toCharArray(); 

		String Words2[] = s1.split(" ");
		System.out.println(Words2[1]);

		
		for(int i=ch.length;i>0;--i){  
			System.out.println(ch[i-1]);  
			}  
		
		
		StringBuilder sb1=new StringBuilder(Inp);  
		sb1.append(" Java");
		sb1.insert(1,"suresh");
		System.out.println(sb1);
		sb1.replace(1,3,"Java");
		System.out.println(sb1);
		
		sb1.reverse();  
		System.out.println(sb1);

		String Words[] = Inp.split(" ");
		System.out.println(Words[1]);

		for (String word : Words) {
		//	System.out.println("Split words :" + word);
			StringBuilder sb=new StringBuilder(word);  
	        sb.reverse();  
			System.out.println("Split reverse words :" + sb);

		}
	}

}
