package in.vj.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any one option from below:- ");
		System.out.println("1: English - US");
		System.out.println("2: French - FR");
		System.out.println("3: Hindi - IN");
		System.out.println("----------------------------------------");
		
		int no = sc.nextInt();
		
		switch (no) 
		{
			case 1: ChooseDetails.localeDetails("en", "US");
				break;
				
			case 2: ChooseDetails.localeDetails("fr", "FR");
				break;
				
			case 3: ChooseDetails.localeDetails("hi", "IN");
				break;
			default:
				System.out.println("Invalid Input.....!");
		}
		sc.close();
	}

}

// Output:-

/*
 
Choose any one option from below:- 
1: English - US
2: French - FR
3: Hindi - IN
----------------------------------------
1

*/
