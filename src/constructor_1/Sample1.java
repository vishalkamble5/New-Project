package constructor_1;

public class Sample1 
{
  //Global non static variable declaration
	
   int a;
   int b;
   // Variable initialization
   Sample1()
   {
	   a=10;
	   b=15;
   }
   
   public void addition()
   {
   System.out.println(a+b);
   
   }
   public static void main(String[] args)
   {
	Sample1 S1 = new Sample1();
	S1.addition();
	
	
	
	
   }
}
