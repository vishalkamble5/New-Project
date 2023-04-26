package constructor_1;

public class Sample_9 
{
     int a=9;
     public static void main(String[]args)
     {
    	 Sample_9 S1 =new Sample_9();
    	System.out.println(S1.a);
    	System.out.println("------");
    	m1();
    	System.out.println("----");
    	Sample_9 S3 =new Sample_9();
    	S3.m2();
    	
     }
     public static void m1()
     {
    	 Sample_9 S2 =new Sample_9();
    	 System.out.println(S2.a);
    	 
     }
     public void m2()
     {
    	 System.out.println(a);
     }
}
