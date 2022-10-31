import java.util.Scanner;
public class Q3smallest
 {
    static int smallest(int ar[])
    {
        int small=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<small)
            {
                small=ar[i];
            }
        }
        return small;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Enter the "+n+"integer value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String args[])
    {
        System.out.println("the smallest element "+smallest(readArray()));
    }
}
    

