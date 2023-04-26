package constructor_1;

public class Sample_4 
{ //global variable declaration
    int num7;
    int num8;
    
    Sample_4()    // user defined constructor
    {
    	// global variable declaration
    	
        num7=80;
    	num8=16;
    }
     //global variable usage
    public void substraction()
    {
    	System.out.println(num7/num8);
    }
 
    static public void main(String[]args) 
    {
	   Sample_4 D1=new Sample_4();        //create object to call method from same class
	   D1.substraction();                 //call method from same class
	   
	   Sample_5 D2=new Sample_5();        //create object to call method from diff class
	   D2.subtraction();                  //call method from diff class
    }

}
