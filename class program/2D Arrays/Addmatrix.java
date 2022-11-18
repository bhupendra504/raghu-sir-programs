import java.util.Scanner;
public class Addmatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");

        int r=sc.nextInt();
        int c=sc.nextInt();

        int [][]mat1=new int[r][c];
        int [][]mat2=new int[r][c];
        int [][]res=new int[r][c];

        System.out.println("Enter the"+r*c+"value row wise: ");
        System.out.println("Enter the mat1");

        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the mat2");
        for(int i=0;i<mat2.length;i++)
        {
            for(int j=0;j<mat2[i].length;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[i].length;j++)
            {
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Adding two matrix:");
        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[i].length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
   