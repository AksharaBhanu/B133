package day02;

public class Demo11 {

	public static void m1(int... a) //var args
	{
		System.out.println(a.length);
		System.out.println("----------");
		for(int v:a)
		{
			System.out.print(v+" ");
		}
		System.out.println();
		System.out.println("----------");
	}
	
	public static void m2(int[] a) //var args
	{
		System.out.println(a.length);
		System.out.println("----------");
		for(int v:a)
		{
			System.out.print(v+" ");
		}
		System.out.println();
		System.out.println("----------");
	}
	public static void main(String[] args) {
		
		Demo11.m1();
		Demo11.m1(10);
		Demo11.m1(10,20);
		Demo11.m1(10,20,30,40,50);
		
//		Demo11.m2();
//		Demo11.m2(10);
		int[] a= {10,20};
		Demo11.m2(a);
	}

}
