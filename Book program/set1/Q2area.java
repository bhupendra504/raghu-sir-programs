import java.util.Scanner;
public class Q2area {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        double radius=3.14*a*a;
        double circumference=2*3.14*a;
        System.out.println("Radius "+radius);
        System.out.println("Circumference "+circumference);
    }
    
}
