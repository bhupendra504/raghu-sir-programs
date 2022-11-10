//TO read the matrix element from the user.
import java.util.Scanner;
public class Readuser {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix");

        int r=sc.nextInt();
        int c=sc.nextInt();
        int [] []mat=new int[r][c];

        System.out.println("Enter "+r*c+"value row wise");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("user entred matrix");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
            sc.close();
        }
    }
    
}
