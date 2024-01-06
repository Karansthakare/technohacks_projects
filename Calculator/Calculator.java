package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2; 
		int ans;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int choice;
		do {
			System.out.println("1. Addition  2.Subtraction  3.Multiiplication 4.Division 5.Modulas");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					ans = n1 + n2;
					System.out.println("Addition :"+ans);
					break;
				
				case 2:
					ans = n1-n2;
					System.out.println("Subtraction : "+ans);
					break;
					
				case 3:
					ans = n1 * n2;
					System.out.println("Multiplication : "+ans);
					break;
				
				case 4:
					ans = n1 / n2;
					System.out.println("Division : "+ans);
					break;
				
				case 5:
					ans = n1 % n2;
					System.out.println("Modulas :"+ans);
					break;
				
				default:
					System.out.println("Invalid Input");
					break;
			}
		}while(choice !=0);
	}
}
