import java.util.Scanner;
public class Q11bmi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weigth");
        int w=sc.nextInt();
        System.out.println("Enter the height ");
        int h=sc.nextInt();

        double bmi=w/(h*h);
        System.out.println("bmi "+bmi);
        sc.close();
    }
    
}
