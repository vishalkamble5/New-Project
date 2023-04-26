package user_Defined;

public class Constructor_Overloading 
{
   //Example of constructor overloading (multiple constructor)
		
		int num1;       //5
		int num2;       //6
		String name;    //Rahul
		
		//user defined without parameter constructor
		Constructor_Overloading()
		{
			num1=10;
			num2=20;
		}
		
	//user defined with 2 int parameter constructor
		Constructor_Overloading (int a, int b)   //5, 6
		{
			num1=a;     //5
			num2=b;//     6
		}
	 //user defined with String parameter constructor
		Constructor_Overloading(String s1)   //s1=Rahul
		{
			name=s1;
		}
		public void addition()
		{
			System.out.println(num1+num2);   //30
		}
		public void studentName()
		{
			System.out.println(name);
		}
		public static void main(String[] args) 
		{
			Constructor_Overloading CO =new Constructor_Overloading();
			CO.addition();
			
			
			System.out.println("---");
			
			Constructor_Overloading CO1 =new Constructor_Overloading(5, 6);
			CO1.addition();
			System.out.println("----");
			
			Constructor_Overloading CO2 =new Constructor_Overloading("Rahul"); 
			CO2.studentName();
		}

	   
   }

