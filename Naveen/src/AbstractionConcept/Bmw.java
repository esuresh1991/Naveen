package AbstractionConcept;

public class Bmw implements Car{

	@Override
	public void start() {
		System.out.println("BMW start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW refuel");
		
	}
	

	public void Theft() {
		System.out.println("BMW Theft");
		
	}

	
	
}
