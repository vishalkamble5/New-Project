package user_Defined;

public class Sample_9 
{
    int num5;
    int num6;
    
    Sample_9(int a, int b)
    {
    	num5=a;
    	num6=b;
    }
    public static void main(String[] args) 
    {
		Sample_9 S2 = new Sample_9(30,15);
		S2.addition();
    	
    	
	}
    public void addition()
    {
    	System.out.println(num5+num6);
    	
    }
}
