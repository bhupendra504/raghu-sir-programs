import java.util.Scanner;
public class Swapnumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();//10
        System.out.println("Enter the second number");
        int b=sc.nextInt();//5
        a=a+b;//15
        b=a-b;//10
        a=a-b;//5
        System.out.println("a value After swapping "+a);
        System.out.println("b value After swapping "+b);
        sc.close();

        
        
    }
    
}
