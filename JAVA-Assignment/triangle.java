import java.util.Scanner;
class triangle
 {
   public static void main(String args[]) 
   {   
      double base,height,area;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the base: ");
      base=sc.nextDouble();
      System.out.println("Enter the height: ");
      height=sc.nextDouble();
      area=(base*height)/2;
      System.out.println("Area of Triangle is " +area);      
   }
}