package methodoverriding;

public class Child extends Parent {

	void calculate(int a)
	{
		System.out.println("Square roo of value = " +Math.sqrt(a));
	}
}
