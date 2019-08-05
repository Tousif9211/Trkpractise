package constructor;

public class Class3 {

	public void method()

	{
         this.method2();
		System.out.println("I am default parameterized method");
	}

	public void method1()

	{
		this.method();
		System.out.println("I am 1 parameterized method");
	}

	public void method2()

	{
		
		System.out.println("I am 2 parameterized method");
	}

	public void method3()

	{
     	this.method1();
		System.out.println("I am 3 parameterized method");
	}

	public static void main(String[] args) {
		Class3 tousif = new Class3();
		tousif.method3();
	}
}
