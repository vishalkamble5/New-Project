package Constructor_2;

public class Sample1 
{
   int a;
   int b;
   
   Sample1()
   {
	   a=10;
	   b=15;
   }
   
   public void add()
   {
	   System.out.println(a+b);
   }
   public void sub()
   {
	   System.out.println(b-a);
   }
   
   public static void main(String[] args)
   {
	  Sample1 S1 = new Sample1();
      S1.add();
      System.out.println("-------");
      S1.sub();
   }
}
