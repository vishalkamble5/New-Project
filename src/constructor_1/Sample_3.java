package constructor_1;

public class Sample_3 
{
//non static global variable declaration
	int num5;
	int num6;
	
	//global variable initialization
	
	Sample_3()                            //user defined global constructor
	{
		num5=100;
		num6=50;
	}
	//global variable usage
	public void sub()                     //non static regular method 
	{
	System.out.println(num5-num6);
	}
	public static void main(String[]args)      
	{
		Sample_3 P1=new Sample_3();       //create object to call from same class 
		P1.sub();                         //call method
		
	}
	
	
}
