package user_Defined;

public class Sample_1 
{
      int num1;                        //non static global variable
      int num2;                        //non static global variable
      
      Sample_1()                     //user defined constructor without parameter
      {
    	  num1=200;
    	  num2=10;
       }   
      public void sub()
      {
    	  System.out.println(num1-num2);
      }
      public void add()
      {
    	 System.out.println(num1+num2);
      }
      public void mult()
      {
    	  System.out.println(num1*num2);
      }
      public void div()
      {
    	  System.out.println(num1/num2);
      }

      public static void main(String[] args)
      {
		Sample_1 N1 =new Sample_1();
		N1.sub();
		System.out.println("-------");
		Sample_1 N2 =new Sample_1();
   	    N2.add();
   	    System.out.println("-------");
   	    Sample_1 N3 =new Sample_1();
   	    N3.mult();
   	    System.out.println("--------");
   	    Sample_1 N4 =new Sample_1();
   	    N4.div();
   	    System.out.println("---------");
   	    Sample_2 S =new Sample_2();
   	    S.add();
   	  }
     
}
