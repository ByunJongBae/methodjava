package opp;

public class Test_class 
{
	
	static String byun="byun";
	
	int joga=666;
	
	static int jogga=1234;
	
	public static void main(String[] args) 
	{
	  Test_class test=new Test_class();
	  System.out.println(test.joga);
	  jogga=1000;
	  System.out.println(Test_class.jogga);
	}

}
