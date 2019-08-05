package pkg1;


public class Parent 
{
 
	public Parent() 
	{
		this(36, 15, 69);
		System.out.println("Parent default Constructor");
	}
	
	public Parent(int a) 
	{
		this(32, 56);
		System.out.println("Parent 1 Parameter Constructor");

	}
	
	public Parent(int a, int b) 
	{
		this();
		System.out.println("parent 2 Parameter Constructor");
	}
	
	public Parent(int a, int b, int c) 
	{

		System.out.println("parent 3 Parameter Constructor");
	}
}
