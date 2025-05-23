package day02;
class Student
{
	String name; //personal info --> non-static var
	static String org="Akshara";//shared info --static var
	
	public void printName()
	{
		System.out.println(name);
	}
	
	public static void printOrg()
	{
		System.out.println(org);
	}
	
	public void printAll()
	{
		System.out.println(name);
		System.out.println(org);
	}
	
	public static void printNothing()
	{
		System.out.println("Nothing");
	}
}
public class Demo14 {

	public static void main(String[] args) {
		

	}

}
