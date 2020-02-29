package AbstractionConcept;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.refuel();
		b.Theft();
		
		Car C = new Bmw();
		C.start();
		C.stop();
		C.refuel();
		///C.Theft();  Parent class variable cant access child class own method
		

	}

}
