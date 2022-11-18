import java.util.Scanner;
public class Q5cetimeter {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cetimeter: ");
        int a=sc.nextInt();

        System.out.println("meter "+a/100);
        System.out.println("foot "+a/30.48);
        sc.close();
    }
    
}
