package Sample.Programs;
import  java.lang.Math;

public class ObjectsMethods
{
	int empno = 230720;
	public static void main(String[] args)
	{
		ArthiOperations obj1 = new ArthiOperations();
		obj1.name = "Naidu";
		obj1.salary=20000;
		System.out.println(obj1.name);
		System.out.println(obj1.salary);
		ArthiOperations obj2 = new ArthiOperations();
		obj2=obj1;
		System.out.println(obj2.name);
		System.out.println(obj2.salary);
		obj2.name = "Kumili";
		obj2.salary=30000;
		System.out.println(obj1.name);
		System.out.println(obj1.salary);
	//	String employee = names();
	//	System.out.println(employee);
		names();
		HelloWorld obj3 = new HelloWorld();
		System.out.println(obj3.wife);
	}
	// The below is a method referred in the main Method
    public static void names() 
    {
    String emp = "Sravs";
    System.out.println(emp);
   // return emp;
    }
    public double currency(int i)
    {
    	double val=Math.sqrt(9);
    	return val;
    	
    }
    
}
