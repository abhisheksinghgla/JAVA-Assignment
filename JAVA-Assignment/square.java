import java.util.Scanner;
public class square
 {
   public static void main(String args[])
   {
      int length,area;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Length:");
      length=sc.nextInt();
      area=length*length;
      System.out.println("Area of the square is " +area);
   }
}