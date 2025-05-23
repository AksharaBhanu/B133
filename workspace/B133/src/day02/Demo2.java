package day02;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		sc.close();
		//Only convertible int values, strings or enum variables are permitted
		switch (n) //byte short int char String enum
		{
			default: System.out.println("Sorry, invalid input");break;
			case 3: System.out.println("You have selected Kannada");break;
			case 1: System.out.println("You have selected English");break;
			case 2: System.out.println("You have selected Hindi");break;
	
		}

		System.out.println("Thank You");
	}

}
