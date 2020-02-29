package Oopspart2;

public class Testbank {
	
	public static void main(String[] args) {
		
		System.out.println(USbank.min_bal);
	
		//USbank.min_bal = 200;  Min_bal is static and cant be changed
		HSBCbank hs = new HSBCbank();
		hs.credit();
		hs.debit();
		hs.eduloan();
		hs.Mutual();
		
		USbank b = new HSBCbank();
		b.credit();
		b.debit();
		
		Indiabank b1 = new HSBCbank();
		b1.Mutual();
		
		//b.eduloan();  cant be called new method added in HSBC.  only Overridden method will be called
		
	
		
	}

}
