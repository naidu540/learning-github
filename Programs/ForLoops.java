package Sample.Programs;

public class ForLoops 
{
	public static void main(String[] args)
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("i = " + i);
		} 		
		//Boolean operators
		boolean a, b;
		int k;
		a=false;
		b=true;
		if(b) System.out.println("The value is true");
		if(a) System.out.println("The value is false");
		System.out.println("10 < 9 is " + (10 <9));
		// Escape sequence or character constants
		System.out.println("The first line is India\nThe second line is Andhra");
		System.out.println("Name\tEmp-no\tSalary");
		System.out.println("Naidu\t230720\t50,000");
		char isit;
		String city;
		//CHAR 1 byte
		isit='a';
		city="New York";
		System.out.println("Display " + isit + " City is " + city);
		int l, n;
		l=10;
		n=20;
		if (l==10 |n==20) System.out.println(" Entered the loop1");
		if (l==10 ||n==5) System.out.println(" Entered the loop2");
	//	if (l==10 |n==20) System.out.println(" Entered the loop3");
    }
}
