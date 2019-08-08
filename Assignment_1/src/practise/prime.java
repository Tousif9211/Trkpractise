package practise;

import java.util.Scanner;

public class prime {
	public static void main(String[] args)

	{
		System.out.println("Please Enter Valua Of A");
		Scanner ref = new Scanner(System.in);
		int num = ref.nextInt();
		
		if(isPrime(num))
    	{
    		System.out.println(num +"Is Prime");
    	}
		else 
		{
			System.out.println(num +"Is Not Prime");
		}
	}

	public static boolean isPrime(int num) 
	{
		for (int i = 2; i <= num - 1; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
