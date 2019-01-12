package opp_test;

import java.util.Scanner;

public class ClassVar 
{
	 
	public int setNumberMan(int man)
	{
		 man=1;
		
		 Scanner scm=new Scanner(System.in);
		 System.out.println("수를 입력!");
		 man=scm.nextInt();
	
		 
		 System.out.println("========= setNumberMan()============");
		 System.out.println(man);
		 System.out.println("========= setNumberMan()_END============");
		 return 0;
	}
	
	public int setNumberWoman(int woman)
	{
		woman=1;
		Scanner scw=new Scanner(System.in);
		System.out.println("========setNumberWoman()=============");
		System.out.println("수를 입력!");
		
		woman=scw.nextInt();
		System.out.println(woman);
		System.out.println("========setNumberWoman()_END=============");
		return 0;
	}

	
	
	
	
}
