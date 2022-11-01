import java.util.Scanner;
public class Mergesorted {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.print("Enter the "+n+"integer value ");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    static void disArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] Mergesort(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
            c[k++]=a[i++];
            else 
            c[k++]=b[j++];
        }
        while(i<a.length)
        {
            c[k++]=a[i++];
        }
        while(j<b.length)
        {
            c[k++]=b[j++];
        }
        return c;
    }
    public static void main(String args[])
    {
        System.out.println("read first array");
        int a[]=readArray();
        System.out.println("read second Array");
        int b[]=readArray();
        int c[]=Mergesort(a, b);
        System.out.println("After merge two sorted Array element ");
        disArray(c);

    }
    
    
}
