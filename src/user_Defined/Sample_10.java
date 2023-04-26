package user_Defined;

public class Sample_10 
{
     int num1;
     int num2;
     
     Sample_10()
     {
    	 num1=40;
    	 num2=18;
    	 
    }
     public static void main(String[] args)
     {
		Sample_10 S = new Sample_10();
		S.addition();
		System.out.println("-------------");
		S.subtraction();
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
