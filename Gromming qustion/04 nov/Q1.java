/*

5 4 3 2 1 
* 4 3 2 1 
* * 3 2 1
* * * 2 1
* * * * 1

 */

import java.util.Scanner;
public class Q1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int x=n;
            for(int j=1;j<=n;j++)
            {
                if(j<i)
                 System.out.print("*"+" ");
                 else 
                  System.out.print(x+" ");
                  x--;
            }
            System.out.println("");
            sc.close();
        }
    }
}



        


