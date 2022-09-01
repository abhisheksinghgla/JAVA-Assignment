import java.util.Scanner;
class Rectangle 
{
   public static void main (String[] args)
   {
	   double area,length,width;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the Length:");
	   length=sc.nextDouble();
	   System.out.println("Enter the Width:");
	   width=sc.nextDouble();
	   area=length*width;
	   System.out.println("Area of Rectangle is " +area);
   }
}