package methodoverloading;

public class MethodOverloading {
	void m1(int a)
	{
		System.out.println(a);
	}
     
	void m1(String s)
	{
		System.out.println(s);
	}
	
	void m1(double d)
	{
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        MethodOverloading x = new MethodOverloading();
        x.m1(5);
        x.m1("siri");
        x.m1(22.33);
	}

}
