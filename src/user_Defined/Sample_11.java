package user_Defined;

public class Sample_11 
{
     int num1;
     int num2;
     
     Sample_11(int a,int b)
     {
    	 num1=a;
    	 num2=b;
     }
     public static void main(String[] args) 
     {
		Sample_11 S = new Sample_11(10,15);
		S.addition();
		System.out.println("-------------");
		Sample_11 S1 = new Sample_11(30,10);
		S1.subtraction();
    	 
    	 
	}
     public void addition()
     {
    	 System.out.println(num1+num2);
     }
     public void subtraction()
     {
    	 System.out.println(num1-num2);
     }
     
}
