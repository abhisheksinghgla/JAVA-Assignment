public class circle 
{
    public static void main(String[] args) 
    {
        int rad;
        double pi=3.14,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        rad=sc.nextInt();
        area=pi*rad*rad;
        System.out.println("Area of circle is " +area);
    }            
}