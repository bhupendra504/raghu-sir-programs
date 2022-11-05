
import java.util.Scanner;
public class Q22merge {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("enter the " + n + " integer value");
        
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
    
        
    }
    public static void disArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static int[] merge(int[]a,int[]b)
    {
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[i+a.length]=b[i];
        }
        return c;
    }
    public static void main(String args[])
    {
   
       System.out.println("Read first array");
       int a[]=readArray();
       System.out.println("Second first array");
       int b[]=readArray();
       System.out.println("user entred first array");
       disArray(a);
       System.out.println("user entred second array");
       disArray(b);

       int c[]=merge(a,b);
       System.out.println("merged array element");
       disArray(c);
       



    }
    
}
