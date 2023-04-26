package constructor_1;

public class Sample3 
{
  //Non static global variable declaration
	int num1;
	int num2;
	int num3;
	
	//Variable declartaion
	
        Sample3(int a,int b,int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
        
        public void addition()
        {
        	System.out.println(num1+num2+num3);
        }
        public void subtraction()
        {
        	System.out.println(num2-num3);
        }
        public void multiplication()
        {
        	System.out.println(num1*num3);
        }
        
        public static void main(String[] args) 
        {
			 Sample3 S4 = new Sample3(10,20,15);
					 S4.addition();
		}

}
