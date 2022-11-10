//Derfine a method to return the biggest element from the metrix.
import java.util.Scanner;
public class Biggest {
    static int getBiggest(int [][]mat)
    {
        int big=mat[0][0];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]>big)
                big=mat[i][j];
            }
        }
        return big;
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
    public static void main(String args[])
    {
        
        int [][]x=readMatrix();
        System.out.println("user enter matrix:");
        disMatrix(x);

        int bg=getBiggest(x);
        System.out.println("biggest value is: "+bg);
    }

          
    }
    

