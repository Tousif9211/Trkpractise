package practise;

import java.util.Scanner;

public class Table {
	public static void main(String[] args)

	{
		System.out.println("Please Enter Valua Of a");
		Scanner ref = new Scanner(System.in);
		int a = ref.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(a +"*"+ i +"="+ a*i);
		}

	}
}	
