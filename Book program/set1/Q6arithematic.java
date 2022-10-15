import java.util.Scanner;
public class Q6arithematic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second integer number: ");
        int b=sc.nextInt();

        System.out.println("Addition "+(a+b));
        System.out.println("subtraction "+(a-b));
        System.out.println("multiplication "+(a*b));
        System.out.println("division "+(a/b));
    }
    
}
