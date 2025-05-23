package day02;

public class Demo10 {

	public static String verifyAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Hi");
			return "U can vote";
		}
		else
		{
			System.out.println("bye");
			return "U can't vote";
		}
	}
	
	public static void main(String[] args)
	{
		
		String m=Demo10.verifyAge(20);
		System.out.println(m);
	}

}
