import java.util.Scanner;
public class Prime {
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
    static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static void printPrime(int[][]mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(isPrime(mat[i][j]))
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
    public static void main(String args[])
    {
        
       System.out.println("Enter the input");
       int x[][]=readMatrix();
       System.out.println("User enter input");
       disMatrix(x);
        System.out.println("prime number present inthe matrix");
        printPrime(x);

    }  
}
