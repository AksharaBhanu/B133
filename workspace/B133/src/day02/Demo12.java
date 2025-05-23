package day02;
class B
{
	int i; //non-static var
	
	B(int i) //constructor
	{
		this.i=i;
	}
	
	public void print() //non-static method
	{
		System.out.println(i);
	}
}
public class Demo12 {

	public static void main(String[] args) {
		B b1=new B(10);
		System.out.println(b1.i);
		b1.print();

	}

}
