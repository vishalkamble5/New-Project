package constructor_1;

public class Sample_ConstructorOverloading
{
   int num1;
   int num2;
   int num3;
   String name;
   String surname;
   
   Sample_ConstructorOverloading()
   {
	   num1=50;
	   num2=12;
   }
   Sample_ConstructorOverloading(int a, int b)
   {
	   num1=a;
	   num2=b;
   }
   Sample_ConstructorOverloading(String Fname)
   {
	   name=Fname;
   }
   public void add()
   {
	   System.out.println(num1+num2);
   }
   public void sub()
   {
	   System.out.println(num3-num1);
   }
   public void studentName()
   {
	   System.out.println(name);
   }
   public static void main(String[]args)
   {
	   Sample_ConstructorOverloading CO = new Sample_ConstructorOverloading();
	   
	   CO.add();
	   Sample_ConstructorOverloading CO1 = new Sample_ConstructorOverloading("Vishal");
	   CO1.studentName();
	   Sample_ConstructorOverloading CO2= new Sample_ConstructorOverloading(25,10);
	   CO.sub();
   }
   
}
