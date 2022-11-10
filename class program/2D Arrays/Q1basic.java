public class Q1basic
{
    public static void main(String args[])
    {
        int [] [] mat={{34,56,78},{11,28,23,},{23,45,34},{72,83}};
        System.out.println(mat.length);
        System.out.println(mat[0].length);

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}