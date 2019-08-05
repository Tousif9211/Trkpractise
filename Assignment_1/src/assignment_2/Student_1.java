package assignment_2;

public class Student_1 {
public int sum(int a, int b)
	{
	    int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int a, int b)
	{
	    int c;
		c=a-b;
		System.out.println("Sub result is "+c);
		return c;
	}
public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Mul result is "+c);
		return c;
	}
private void div(int a, int b)
{
	int c;
	c=a/b;
	System.out.println("Final result is "+c);
}
public static void main(String[] args) {
	Student_1 tousif=new Student_1();
	int Sum_Result1=tousif.sum(10, 2);
	int Sub_Result2=tousif.sub(Sum_Result1,2);
	int sum_Result3=tousif.sum(Sub_Result2,2);
	int mul_Result4=tousif.mul(sum_Result3,2);
	tousif.div(mul_Result4,2);	
}
}