package day02;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		sc.close();
		
		if(n>=1)
		{
			System.out.println("Positive Number");
		}
		else if(n<=-1)
		{
			System.out.println("-ve Number");
		}
		else
		{
			System.out.println("ZERO");
		}
		
		System.out.println("Thank You");
		
	}

}
