import java.util.Scanner;
public class Matrixaddtion {
    static int[][] getTranspose(int a[][])
    {
        int b[][]=new int [a.length][a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[i][j]=a[j][i];
            }
            return b;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
            int x[][]=getTranspose(a);
            
        }
    }
    
}
