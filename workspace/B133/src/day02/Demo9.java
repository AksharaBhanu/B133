package day02;

interface A
{
	abstract public void m1();
}

public class Demo9 {
//header+ body --> complete method concrete method
//header--> abstract method incomplete method
//body--> lambda
	
	public static void m1()//header declaration
	{
		System.out.println("hi");			//body implementation
	}
	
	public static void m2(String a,int b)
	{
		System.out.println(a+b);			
	}
	
	public static int m3(int a,int b)
	{
		int sum=a+b;
		return sum;
//		System.out.println("end");//Unreachable code
	}
	public static void main(String[] args) {
		
		Demo9.m1();
		Demo9.m2("bhanu",1);
		int res=Demo9.m3(10,20);
		System.out.println(res);
	}

}
