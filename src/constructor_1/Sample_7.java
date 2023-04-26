package constructor_1;

public class Sample_7
{
     int num1;
     int num2;
     
     Sample_7(int a,int b)        //user defined constructor
     {
    	 num1 = a;                // variable initialization
    	 num2 = b;
     }
     public void addition()          //non static method declaration
     {
    	 System.out.println(num1+num2);
     }
     public void sub()
     {
    	 System.out.println(num1-num2);
     }
     public void mul()
     {
    	 System.out.println(num1*num2);
     }
     public static void main(String[]args)
     {
    	 Sample_7 S4=new Sample_7(10,20);          //create object for non static method
    	 S4.addition();                             //call method
    	 System.out.println("---------");
    	 Sample_7 S5 =new Sample_7(30,40);
    	 S5.addition();
    	 System.out.println("------------");
    	 Sample_7 S6 =new Sample_7(100,50);
    	 S6.sub();
    	 System.out.println("----------");
    	 Sample_7 S7 =new Sample_7(10,30);
    	 S7.mul();
     }
}
