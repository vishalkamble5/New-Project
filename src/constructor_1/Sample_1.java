package constructor_1;

public class Sample_1
{
         //Non static global variable declaration
	     int num1;
         int num2;
	
	Sample_1()
	{
		// variable initialization
		num1=25;
		num2=20;
	}
	
	//variable usage
	public void addition()
	{
		System.out.println(num1+num2);
	}
	
	public static void main(String[]args)
	{
		Sample_1 S1=new Sample_1();      //object create to call method from same class
		S1.addition();                     //call method from same class
		
		Sample_2 S2=new Sample_2();      //object create to call non static method from diff class.
		S2.mult();
	}
	
	
}
