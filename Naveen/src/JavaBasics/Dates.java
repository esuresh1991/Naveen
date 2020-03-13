package JavaBasics;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.lang.String;

public class Dates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		 
			String input_date="19/10/1991";
		    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		    Date dt1=format1.parse(input_date);
		   
		  System.out.println(new SimpleDateFormat("EEEEE", Locale.ENGLISH).format(dt1.getTime()));
		    
		
	}

}
