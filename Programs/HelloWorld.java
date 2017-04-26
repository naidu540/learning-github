package Sample.Programs;

public class HelloWorld
{
	String wife = "Sravanthi";
  /*
   * This is my first program.
   * This is multiple line comment
  */
  public static void main(String[] args)
  {
    // This is single line comment
	System.out.println("This is my first Hello world Program");
	//System.out.println('\n');
	int i = 0;
	i = 10;
	System.out.println("The value of i is "+ i);
	ObjectsMethods object1 = new ObjectsMethods();
	//object1.names();
	ObjectsMethods.names();
	
	double l=object1.currency(30);
	System.out.println(l);
	
	ArthiOperations obj=new ArthiOperations();
	int k=obj.add();
	System.out.println(k);
	}
}
