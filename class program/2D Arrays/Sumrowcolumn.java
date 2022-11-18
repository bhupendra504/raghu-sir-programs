// Define a method to return rowwise sum and column wise sum.
import java.util.Scanner;
public class Sumrowcolumn {
    static int[]rowWise(int [][]mat)
    {
        int[]sum=new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                sum[i]=sum[i]+mat[i][j];
            }
        }
        return sum;
    }
     static int[] columnWise(int [][]mat)
     {
        int[] sum=new int[mat[0].length];
        for(int i=0;i<mat[0].length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                sum[i]=sum[i]+mat[j][i];
            }
        }
        
        return sum;
    }
    static int[][] readMatrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int [][]mat=new int[r][c];
        System.out.println("Enter the "+r*c+"value row wise");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
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
        int[][]x=readMatrix();
        System.out.println("Enter the user matrix");
        int ab[]=rowWise(x);
        for(int i=0;i<ab.length;i++)
        {
            System.out.println("sum of row "+(i+1)+"--> "+ab[i]);
        }
        ab=columnWise(x);
        for(int i=0;i<ab.length;i++)
        {
            System.out.println("sum of column "+(i+1)+"--> "+ab[i]);
        }
    }
    
}
