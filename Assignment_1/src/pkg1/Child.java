package pkg1;

public class Child extends Parent
{

	public Child() 
	{
		this(21, 23);
		System.out.println("Child Default Constructor");
	}
	
	public Child(int a) 
	{
		this(13, 15, 16);
		System.out.println("Child 1 Parameter Constructor");
	}
	
	public Child(int a, int b) 
	{
		super(21);
		System.out.println("Child 2 Parameter Constructor");
	}
	
	public Child(int a, int b, int c) 
	{
		this();
		System.out.println("Child 3 Parameter Constructor");
	}
	public static void main(String[] args) 
	{
		Child trk = new Child(21);
	}
}
