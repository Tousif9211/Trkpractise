package practise;

import java.util.Scanner;

public class primechk
{

	public static void main(String[] args) 
	{
		System.out.println("Please enter value of a");
		Scanner chk=new Scanner(System.in);
		int a=chk.nextInt();
		
		for (int i =2; i<=50; i++)
		{
			if(a%2==0)
			{
				System.out.println("not");
			}
			else
			{
				System.out.println("yes");
			}
		}
	} 
	
	
}
