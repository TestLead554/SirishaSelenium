package callingsuperclassvariable;

public class Cat extends Animal 
{
  int cat_age = 7;
  void display()
  {
	  int a = super.cat_age;
	  int b = this.cat_age;
	  System.out.println("Cat age is in super class =" +a);
	  System.out.println("Cat age is in sub class =" +b);
	  
	  
  }
}
