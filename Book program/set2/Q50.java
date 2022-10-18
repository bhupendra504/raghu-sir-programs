import java.util.Scanner;
public class Q50 {
    static Scanner sc=new Scanner(System.in);
    static int b,h;
    static
    {
        System.out.println("Enter the base");
        b=sc.nextInt();
        System.out.println("Enter the hight");;
        int h=sc.nextInt();
        int area=b*h;

        if(b<=0||h<=0)
        {
            System.out.println("Error");
        }
        else 
        {
            System.out.println("Area parallelogram: "+area);
        }
    }
        public static void main(String args[])
        {

        }
}
