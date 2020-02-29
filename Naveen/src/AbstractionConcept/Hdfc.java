package AbstractionConcept;

public class Hdfc extends Bank{

	@Override
	public void Loan() {

		System.out.println("HDFC - Loan ");
		
	}
	
	
	public void Credit() {
		System.out.println("Non abstract - HDFC Credit ");						//Non abstract method
}

	
	public void Funds() {
		System.out.println(" HDFC Funds");					
}
	

}
