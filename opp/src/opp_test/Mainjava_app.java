package opp_test;

import java.util.Scanner;

public class Mainjava_app 
{
	
	public static void main(String[] args)
	{
		
		int man_0=1;
		int woman_0=1;	
		
		Scanner sc0=new Scanner(System.in);
		
		System.out.println("수를 입력!!!");
		man_0=sc0.nextInt();
		woman_0=sc0.nextInt();
		
		ClassVar cls=new ClassVar();
		cls.setNumberMan(man_0);
		cls.setNumberWoman(woman_0);
		
	    if (man_0==1&&woman_0==1)
	    {
			System.out.println("test 성공");
		}
	    else
	    {
	    	System.out.println("실패!");
	    }
		
	}

}
