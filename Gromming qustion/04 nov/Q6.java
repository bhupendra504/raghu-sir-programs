/*
                        1 
                      2 1 
                    3 2 1 
                  4 3 2 1
                5 4 3 2 1
 */
import java.util.Scanner;
public class Q6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}

