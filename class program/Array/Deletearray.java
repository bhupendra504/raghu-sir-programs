import java.util.Scanner;
public class Deletearray {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("ENter the"+n+ "integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    static void disArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] deleteArray(int ar[],int in)
    {
        if(in<0 || in>ar.length)
        {
            System.out.print("Index not of the range");
            return ar;
        }
        int [] br=new int[ar.length-1];
        for(int i=0;i<br.length;i++)
        {
            if(i<in)
            {
                br[i]=ar[i];
            }
            else 
            {
                br[i]=ar[i+1];
            }
        }
        return br;
    }
    public static void main(String args[])
    {
        System.out.println("read Array");
        int a[]=readArray();
        a=deleteArray(a, 2);
        System.out.println("After delete");
        disArray(a);
    }
    
}
