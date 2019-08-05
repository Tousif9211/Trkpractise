package practise;

public class student3 
{
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
System.out.println("sub result is "+c);
return c;
}

public int mul(int a, int b) 
{
int c;
c=a*b;
System.out.println("mul result is "+c);
return c;
}

public void div(int a, int b) 
{
	int c;
	c=a/b;
	System.out.println("div result is "+c);
}

public static void main(String[] args) 
{
student3 trk=new student3();
int sum_result=trk.sum(10, 2);
int sub_result=trk.sub(10, 2);
int mul_result=trk.mul(sum_result, sub_result);
int mul_resultt=trk.mul(mul_result, 10);
trk.div(mul_resultt, 12);
}
}
