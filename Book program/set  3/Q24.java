/*
            1  
            23 
            456
            7891
            23456
 */

import java.util.Scanner;
public class Q24 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);

                count++;
                if(count==10)
                {
                    count=1;
                }
            }
            System.out.println();
            sc.close();
        }
    }
    
}
