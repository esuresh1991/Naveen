package JavaBasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Leapyear {

	public static void main(String[] a) throws ParseException {
		// TODO Auto-generated method stub
		
	//	int b=Integer.parseInt(a[0]);
	//	int c=Integer.parseInt(a[1]);
		int b = 2000;
		int c = 2200;
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		ArrayList<Integer> z = new ArrayList<Integer>();
		
		
		for(int i = b; i<=c; i++)
		{
			
			if(i%400 == 0)
			{
				 z.add(i);
			}
			else if (i%100 == 0)
			{
				 y.add(i);
			}
			else if (i%4 == 0)
			{
				z.add(i);
			}
			else
			{
				y.add(i);
			}
				
		}
		
		 for (int element: z) {
			 
	            System.out.println("Leap Years :" + element);
	            String input_date="29/02/"+element;
			    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			    Date dt1=format1.parse(input_date);
			    System.out.println(new SimpleDateFormat("EEEEE", Locale.ENGLISH).format(dt1.getTime()));
	        }
		 for (int element: y) {
	            System.out.println("Non Leap Years :" +element);
	        }
		
		    
	}
}