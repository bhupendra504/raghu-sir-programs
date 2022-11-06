//write a java program to define a method to print common elements between 2 array.
import java.util.Scanner;
public class Q28commomelement {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+" integar number");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
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
    static void commonElement(int a[],int b[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]+" ");
                }
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println("Read first array ");
        int a[]=readArray();
        System.out.println("Read second array");
        int b[]=readArray();
        System.out.println("user enter first Array ");
        disArray(a);
        System.out.println("User enter second Array");
        disArray(b);
        System.out.println("Commom element");
        commonElement(a, b);
     
    }
    
}
