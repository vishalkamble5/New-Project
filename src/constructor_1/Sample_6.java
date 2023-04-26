package constructor_1;

public class Sample_6 
{
     int value1;
     int value2;
     
     Sample_6()
     {
    	 value1=45;
    	 value2=15;
     }
     
     public void addition()
     {
    	 System.out.println(value1+value2);
     }
     static public void  main(String[]args)
     {
    	 Sample_6 P1=new Sample_6();
    	 P1.addition();
     }
     
}
