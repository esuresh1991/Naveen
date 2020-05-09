package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hdfc hb  = new Hdfc();
		hb.Credit();
		hb.Debit();
		hb.Loan();
		hb.Funds();
		
		Bank b  = new Hdfc();
		b.Credit();
		b.Debit();
		b.Loan();
		
		Bank c  = new Sbi();
		c.Credit();
		c.Debit();
		c.Loan();
		
		//Bank d = new Bank();   we cant create object for Abstract/interface class
		
		
	}

}
