package constructor_1;

public class Sample_8 
{
   int num1;               //non static global variable
   int num2;
   
   Sample_8(int a,int b)        //user defined constructor
   {
	   num1= a;                 //local variables
//	   num2=b;                 //local variables
   }
   public void add()
   {
	   System.out.println(num1+num2);
	   System.out.println("-------------");
   }
   public void sub()
   {
	   System.out.println(num1-num2);
	   System.out.println("--------------");
   }
   public void mult()
   {
	   System.out.println(num1*num2);
	   System.out.println("----------------");
   }
   public void div()
   {
	   System.out.println(num1/num2);
	   System.out.println("-----------------");
   }
   public static void main(String[]args)
   {
	   Sample_8 S1=new Sample_8(20,20);          
	   S1.add();                                   //call method 'add' from same class
	   Sample_8 S2=new Sample_8(40,30);
	   S2.add();                                   //call method 'add' from same class
	   Sample_8 S3 =new Sample_8(50,20);
       S3.sub();                                   //call method 'sub' from same class
       Sample_8 S4=new Sample_8(5,3);
       S4.mult();                                  //call method 'mult' from same class
       Sample_8 S5=new Sample_8(60,12);
       S5.div();                                   //call method 'div' from same class
	   
   }
}
