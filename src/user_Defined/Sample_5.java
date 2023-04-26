package user_Defined;

public class Sample_5 
{
      int num5;
      int num6;
      String name;
      
      Sample_5()
      {
    	  num5=10;
    	  num6=15;
    	  name="Vishal";
      }
      
      Sample_5(int a, int b)
      {
    	  num5=a;
    	  num6=b;
      }
      Sample_5(String c)
      {
    	  name=c;
      }
      public void add()
      {
    	  System.out.println(num5+num6);
      }
      public void m1()
      {
    	  System.out.println(name);
      }
      public void mult()
      {
    	  System.out.println(num5*num6);
      }
      public void name()
      {
    	  System.out.println(name);
      }
   
      public static void main(String[]args)
      {
    	  Sample_5 S5 =new Sample_5();
    	  S5.add();
    	  
    	  System.out.println("------");
    	  
    	  Sample_5 S6 =new Sample_5();
    	  S6.m1();
    	  
    	  System.out.println("--------");
    	  
    	  Sample_5 S7 = new Sample_5(5,6);
    	  S7.mult();
    	  
    	  System.out.println("-------");
    	  
    	  Sample_5 S8 =new Sample_5("Pallavi");
    	  S8.name();
    	  
    	  
    	  
      }
}
