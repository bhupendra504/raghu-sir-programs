import java.util.Scanner;
public class Pratice {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
       
    }
    
}
