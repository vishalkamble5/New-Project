package user_Defined;

public class Sample_7 
{
   int num1;
   int num2;
	
	Sample_7()
    {
    	num1=25;
    	num2=11;
    }
	
public static void main(String[]args)
{
	Sample_7 S = new Sample_7();
	S.add();
	System.out.println("---------");
	Sample_8 S1 = new Sample_8();
	S1.sub();

}
    public void add()
    {
    	System.out.println(num1+num2);
    	
    }
}
