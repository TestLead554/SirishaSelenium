package abstraction;

public class Santro extends Car {
	
	Santro(int regno)
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
		System.out.println("Santro car is having different direction and angle");
	}

	void breaks(int force)     //concrete or implemented method
	{
		System.out.println("Santro car is having different breaks when compare to other cars");
	}
}
