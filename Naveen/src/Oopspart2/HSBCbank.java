package Oopspart2;

public class HSBCbank implements USbank, Indiabank{

	@Override // from USbank
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC credit");
		
	}

	@Override  // from USbank
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC debit");
		
	}

	@Override  // from USbank
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("HSBC transfer");
		
	}
	
	public void carloan()   // new method for HSBC
	{
		// TODO Auto-generated method stub
		System.out.println("HSBC carloan");
		
	}
	
	public void eduloan()  // new method for HSBC
	{
		// TODO Auto-generated method stub
		System.out.println("HSBC eduloan");
		
	}

	@Override  // from Indiabank
	public void Mutual() {
		// TODO Auto-generated method stub
		System.out.println("HSBC Mutual");
	}
	
	

	
}
