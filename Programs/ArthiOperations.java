package Sample.Programs;

public class ArthiOperations 
{
	public int salary = 10000;
    String name = "Naidu";
    String kid = "Aarohi";
    String wifey = "shravs";
   public static void main(String[] args) 
   {
	int sub,add,mul,div,i,j;
	i = 10;
	j = 20;
	add=i+j;
    sub=j-i;
    mul=i*j;
    div=j/i;
    // % modulus gives the remainder
    if (add==30)
      {
         System.out.println("Add is correct and the value is " + add);
      }
    else if(add!=30)
       {
    	System.out.println(" Add is not correct");
       }
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(div);
    }
   
   public int add()
   {
	   return 4;
   }
   }

   

