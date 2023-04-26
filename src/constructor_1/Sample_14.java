package constructor_1;

public class Sample_14
{
 int num1=12;
 int num2=5;
 

public void addition()
{
	System.out.println(num1+num2);
}
public static void main(String[]args)
{
	Sample_14  S =new Sample_14();
	S.addition();
	System.out.println("------");
	Sample_14 S1 =new Sample_14();
	System.out.println(S1.num1);
}
       public void m1()
{
	System.out.println(num1);
	
}
}