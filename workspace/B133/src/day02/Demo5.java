package day02;

import java.util.ArrayList;

public class Demo5 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		for(int v:a)
		{
			System.out.println(v);
		}
		
		ArrayList<String> allNames=new ArrayList<String>();
		allNames.add("Madhuri");
		allNames.add("Ashok");
		allNames.add("Roopa");
		allNames.add("Vishal");
		
		for(String name:allNames)
		{
			System.out.println(name);
		}
		

	}

}
