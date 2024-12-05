package callingsuperclassmethod;

public class Cat extends Animal {
	
	void meow()
	{
		super.display();
		System.out.println("cat is doing meow");
	}

}
