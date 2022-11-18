import java.util.Scanner;
public class Q4square {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        int a=sc.nextInt();
        int side=a*a;
        int perimeter=4*a;

        System.out.println("Side "+side);
        System.out.println("perimeter: "+perimeter);
        sc.close();
    }

    
}
