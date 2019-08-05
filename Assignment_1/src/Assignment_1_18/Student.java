package Assignment_1_18;

public class Student {

	int age;
	int roll_no;
	
	public void display1()
	
	{
		
		System.out.println("Welcome to all of you" +"\n"+"Welcome to Selenium Automation");
		
	}
	
	
public static void main(String[] args) 
{
	Student Abu=new Student();
	Abu.display1();
	Abu.age=25;
	Abu.roll_no=100;
	System.out.println(Abu.age +"\n"+Abu.roll_no);
}
}
