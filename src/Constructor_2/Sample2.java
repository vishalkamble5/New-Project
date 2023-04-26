package Constructor_2;

public class Sample2 
{
   int num1;
   int num2;
   
   Sample2(int a, int b)
   {
	   num1=a;
	   num2=b;
   }
   
   public void add()
   {
	   System.out.println(num1+num2);
   }
   public static void main(String[]args)
   {
	   Sample2 S2 = new Sample2(10,20);
	   
	   S2.add();
   }
}
