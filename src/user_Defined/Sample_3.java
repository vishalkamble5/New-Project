package user_Defined;

public class Sample_3 
{
     int num1;        //global non static variable
     int num2;        //global non static variable
     
     Sample_3(int a,int b)     //user defined constructor
     {
    	 num1=a;         // local variable a,b are initialized with global variable num1 & num2.
    	 num2=b;
    }
     
     public void add()
     {
    	 System.out.println(num1+num2);
     }
     public void sub()
     {
    	 System.out.println(num1-num2);
     }
     public static void main(String[] args) 
     
     {
		  Sample_3 S = new Sample_3(10,20);
		  S.add();
		  System.out.println("--------");
		  Sample_3 S2 =new Sample_3(50,25);
		  S2.sub();
		  System.out.println("---------");
		  Sample_4 S3 =new Sample_4(7,8);
		  S3.mult();
	 }
}
