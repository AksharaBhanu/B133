package day02;

public class Demo3 {

	public static void main(String[] args) {

		int age=17;
		
//		if(age>=18)
//		{
//			System.out.println("U can vote");
//		}
//		else
//		{
//			System.out.println("U can not vote");
//		}
		
		//res=condition? tv:fv;
		
		String msg=(age>=18)?"U can vote":"U can not vote";
		System.out.println(msg);
	}

}
