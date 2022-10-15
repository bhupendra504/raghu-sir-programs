import java.util.Scanner;
public class Namedecrement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        while(n>0)
        {
            System.out.println(n);
            n--;
        }
        System.out.println("Thank you");
    }
    
}
