package methodoverloading;

public class MethodOverloading1 {
	
	void m1(int x, int y)
	{
		System.out.println("addition of two numbers = " +(x+y));
	}
	
	void m1(int x, int y, int z)
	{
		System.out.println("addition of 3 number = " +(x+y+z));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading1 a = new MethodOverloading1();
	
		a.m1(5,6 );
		a.m1(55, 66, 77);
		
	}

}
