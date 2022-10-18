import java.util.Scanner;
public class Q15 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
