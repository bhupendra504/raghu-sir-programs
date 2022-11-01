import java.util.Scanner;
public class Zigzag {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "  +n+ "integer value ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void disArray(int[]ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static int[] zigzag(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
        int i=0,j=0;
        while(i<a.length&&i<b.length)
        {
            c[j++]=a[i];
            c[j++]=b[i++];
        }
        while(i<a.length)
        {
            c[j++]=a[i++];
        }
        while(i<b.length)
        {
            c[j++]=b[i++];
        }
        return c;
    }
    public static void main(String args[])
    {
       System.out.println("read first Array");
       int a[]=readArray();
       System.out.println("Enter the second Array");
       int b[]=readArray();

       int c[]=zigzag(a, b);
       System.out.print("After merge two array ");
       disArray(c);
    }
    
}
