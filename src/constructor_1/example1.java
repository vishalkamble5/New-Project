package constructor_1;

public class example1 
{
  int num1, num2;
  
  example1(int a, int b)
  {
	num1=a;
	num2=b;
  }
  
  public void addition()
  {
	  System.out.println(num1+num2);
  }
  public void multiplication()
  {
	  System.out.println(num1*num2);
  }
  
  public static void main(String[]args)
  {
	  example1 e=new example1(10, 20);
	  e.addition();
	  e.multiplication();
  }
}
