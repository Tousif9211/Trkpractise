package constructor;

import java.util.Scanner;

public class scanner {
	
	public int Sum(int a,int b) 
	{
		int c;
		c=a+b;
		System.out.println("Sum result of" +c);
		return c;
		
	}
	public int Sub(int a,int b) 
	{
		int c;
		c=a-b;
		System.out.println("Sub result of" +c);
		return c;
		
	}
	public int Mul(int a,int b) 
	{
		int c;
		c=a*b;
		System.out.println("Mul result of" +c);
		return c;
		
	}
	public void Div(int a,int b) 
	{
		int c;
		c=a/b;
		System.out.println("Div result of" +c);
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	
		System.out.println("Please enter value of V1");
		int V1= s.nextInt(); 
		System.out.println("Please enter value of V2");
		int V2= s.nextInt(); 
		System.out.println("Please enter value of V3");
		int V3= s.nextInt(); 
		System.out.println("Please enter value of V4");
		int V4= s.nextInt(); 
		System.out.println("Please enter value of V5");
		int V5= s.nextInt(); 
		System.out.println("Please enter value of V6");
		int V6= s.nextInt(); 
		
		scanner obj=new scanner();
		int result1=obj.Sum(V1,V2);
		int result2=obj.Sub(result1,V3);
		int result3=obj.Sum(result2,V4);
		int result4=obj.Mul(result3,V5);
		obj.Div(result4,V6);
		
		
		
		
		
	}
}
