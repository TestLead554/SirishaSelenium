package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maruthi car details");
		System.out.println("--------------------");
		
		Maruti m1 = new Maruti(10);
		System.out.println(m1.regno);
		m1.steering(100, 250);
		m1.breaks(150);
		System.out.println();
		
		System.out.println("Santro car details");
		System.out.println("--------------------");
		
		Santro s = new Santro(50);
		System.out.println(s.regno);
		s.steering(110,300);
		s.breaks(500);
	}

}
