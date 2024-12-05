package heirarchicalinheritanceexample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College c1 = new College();
		c1.setId(10011);
		c1.setName("Aditya Engg college");
		c1.setAddress("Hyderabad");
		
		System.out.println("Id of the college = " +c1.getId());
		System.out.println("Name of the college = " +c1.getName());
		System.out.println("Address of the college = " +c1.getAddress());
		
		Principal p = new Principal();
		p.evaluate();
		
		Student s = new Student();
		s.setMarks(545);
		System.out.println("Marks of the students= " +s.getMarks());
		
		Teacher t = new Teacher();
		t.setSalary(20000);
		System.out.println("Salary of the teacher = "+t.getSalary());
		
		}

}
