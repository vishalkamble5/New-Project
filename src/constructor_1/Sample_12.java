package constructor_1;

public class Sample_12
{
    int num1;                   // global non static variable
    int num2;                   // global non static variable
    
    Sample_12()
    {
    	num1=12;
        num2=3;
    	
    }
   
    public static void main(String[]args)
    {
    	Sample_12 S4 =new Sample_12();
    	S4.addition();
    }
    public void addition()
    {System.out.println(num1+num2);
    }
}
