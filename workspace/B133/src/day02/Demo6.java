package day02;

public class Demo6 {

	public static void main(String[] args) {
		String msg="Not found";
		
		int[] a= {10,20,30,40};
		for(int v:a)
		{
			if(v==30)
			{
				msg="found";
				break;//all types of looping statements + switch 
			}
		}
		
		System.out.println(msg);
	}

}
