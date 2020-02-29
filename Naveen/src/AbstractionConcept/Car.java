package AbstractionConcept;

public interface Car {
	
	//Always define only abstract method
	// We acheve 100% abstraction
	// we can create object for Abstract/interface class
	// Only final and static variable can be created in interface class
	
	int wheels  = 100;
	
	public void start();
	public void stop();
	public void refuel();
	

}
