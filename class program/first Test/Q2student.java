import java.util.Scanner;
public class Q2student {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        if(a>34&&b>34&&c>34&&d>34)
        {
            System.out.println("Pass");
        }
        else 
         {
            System.out.println("fail");
         }
    }
    
}
