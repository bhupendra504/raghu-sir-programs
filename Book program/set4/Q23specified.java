import java.util.Scanner;
public class Q23specified{
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.print("Enter the "+n+  " integer value");
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
            System.out.print(arr[i]+ " ");
        }
    }
    static int[] insertArray(int ar[],int ele,int in)
    {
        if(in<0&&in>ar.length)
        {
            System.out.println("index not int the array");
            return ar;
        }
        int [] br=new int[ar.length+1];
          br[in]=ele;
        for(int i=0;i<ar.length;i++)
        {
             if(i<in)   
              br[i]=ar[i];
              else 
               br[i+1]=ar[i];
        }
        return br;
    }
    public static void main(String args[])
    {
        System.out.println("read Array");
        int a[]=readArray();
        a=insertArray(a, 39, 2);
        System.out.println("After insert");
        disArray(a);
    }
    
}

