package abstraction;

public abstract class Car {  //any class is having one unimplemented or abstract method then this class is called abstract class or unimplemented class
	int regno;        
	Car(int regno)
	{
		this.regno = regno;
	}
	
	void openFuelTank()
	{
		System.out.println("for every car tank is open and fill the fuel");
	}
	
    abstract void steering(); //Unimplemented method
	abstract void breaks();  //Unimplemented method
	

}
