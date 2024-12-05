
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.setId(11);
		t.setName("Sirisha");
		t.setSal(2000);
		System.out.println("Teacher details");
		System.out.println("------------------");
		System.out.println("Id of the teacher=" +t.getId());
		System.out.println("Name of the teacher=" +t.getName());
		System.out.println("Salary of the teacher=" +t.getSal());
		System.out.println("Student details");
		System.out.println("------------------");
		Student s = new Student();
		s.setId(22);
		s.setName("Raj");
		s.setMarks(550);
		System.out.println("Id of the Student=" +t.getId());
		System.out.println("Name of the Student=" +t.getName());
		System.out.println("Salary of the Student=" +t.getSal());
	}

}
