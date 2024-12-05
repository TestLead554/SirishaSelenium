package heirarchicalinheritanceexample;

public class Student extends College {
	
	/*void Marks()
	{
		System.out.println("marks of the student= " +marks);
	}*/
	int marks;
	void setMarks(int marks)
	{
		this.marks = marks;
	}
	int getMarks()
	{
		return marks;
	}
}
