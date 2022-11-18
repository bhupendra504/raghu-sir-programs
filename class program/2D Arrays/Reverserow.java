// define a method to reverse a metrix roe wise.
import java.util.Scanner;
public class Reverserow {
    static int[][] rowWise(int [][]mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            int f=0,l=mat[i].length-1;
            while(f<l)
            {
                int temp=mat[i][f];
                mat[i][f]=mat[i][l];
                mat[i][l]=temp;
                f++;
                l--;
            }
        }
        return mat;
    }
    static int [][] readMatrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int [][]mat=new int[r][c];
        System.out.println("Enter "+r*c+"value row wise");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }
    static void disMatrix(int[][]mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
      
    }
    public static void main(String[] args) {
        int [][]x=readMatrix();
        System.out.println("Enter the user matrix");
        disMatrix(rowWise(x));
       
        
    }
    
}
