/*
                1    1  
                12   21 
                123  321
                1234 4321
                123454321
 */

import java.util.Scanner;
public class Q40 {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                if(j==n)
                {
                    System.out.print("");
                }
                else 
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
