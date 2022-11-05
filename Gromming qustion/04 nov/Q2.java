/* 

1 * * * * 
1 2 * * * 
1 2 3 * *
1 2 3 4 *
1 2 3 4 5

 */

import java.util.Scanner;
public class Q2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int x=1;
            for(int j=1;j<=n;j++)
            {
                if(j>i)
                 System.out.print("*"+" ");
                 else 
                  System.out.print(x+" ");
                  x++;
            }
            System.out.println("");
            sc.close();
        }
    }
}

