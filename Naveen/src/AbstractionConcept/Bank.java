package AbstractionConcept;

public abstract class Bank {

	//Partail abstraction
	//Hinding the implemnetaion logic -- is called abstraction
	
	public abstract void Loan();  // abstract method
	
	//Non abstract methods
	public void Credit() {
				System.out.println("Non abstract - Credit card ");						//Non abstract method
	}
	
	
	public void Debit() {
		System.out.println("Non abstract - Debit ");						//Non abstract method
}

	
}
