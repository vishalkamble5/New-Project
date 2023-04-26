package user_Defined;

public class Sample_6 
{
     int num1;
     int num2;
     
     Sample_6(int a, int b)
     {
    	num1=a;
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
    		Sample_6 S = new Sample_6(15,20);
    		S.add();
    		System.out.println("-------");
    		Sample_6 S2 = new Sample_6(50,20);
    		S2.sub();
    		System.out.println("--------");
    		Sample_6 S1 = new Sample_6(7,8);
    		S1.mult();
    		System.out.println("---------");
    		Sample_6 S3 = new Sample_6(125,5);
    		S3.div();
    		
    	}
     }

