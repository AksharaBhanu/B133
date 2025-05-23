package day02;

public class Demo7 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
//				break;//exit the loop
				continue;//skip remaining code --go to next iteration
			}
			
			System.out.print(i+" ");
		}

	}

}
