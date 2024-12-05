package abstraction;

public class Maruti extends Car {  //concrete class
	
	Maruti(int regno)
	{
		super(regno);
	}
	void steering()
	{
	}
	void breaks()
	{
	}
	

	void steering(int direction, int angle)  //concrete or implemented method
	{
		System.out.println("Maruthi car is having only normal direction and angle");
	}

	void breaks(int force)     //concrete or implemented method
	{
		System.out.println("Maruthi car is having hydralic breaks");
	}

	
		
	}

	
		
	
