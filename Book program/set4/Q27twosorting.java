//write a program to define a method to merge 2 sorted element into single array in sorted format.
import java.util.Scanner;
public class Q27twosorting {
    static int[] readArray()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the " + n + " integer value");
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
        System.out.println();
    
    }
    static int[] sortArray(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i++];
            }
            else 
            {
                c[k++]=b[j++];
            }
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
        System.out.println("Read first array");
        int a[]=readArray();
        System.out.println("Read second array");
        int b[]=readArray();
        System.out.println("user enter first array");
        disArray(a);
        System.out.println("User enter second array");
        disArray(b);
        int c[]=sortArray(a, b);
        System.out.println("sorted Array element");
        disArray(c);



    }
    
    
}
