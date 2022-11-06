//write a java program to define a method to arrange all the even elements should comes after the odd elements.
import java.util.Scanner;
public class Q36oddeven {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+"Integer value");
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
    static int  countEven(int ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }
    static int countOdd(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        return count;
    }
    static int[] evenPresent(int ar[])
    {
        int []evenArray=new int [countEven(ar)];
        int j=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
            {
                evenArray[j++]=ar[i];
            }
        }
        return evenArray;
    }
    static int[] oddPresent(int arr[])
    {
        int oddArray[]=new int[countOdd(arr)];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
             oddArray[j++]=arr[i];
            }
        }
        return oddArray;
    }
    public static int[] zigzag(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
        int i=0,j=0;
        while(i<a.length&&j<b.length)
        {
            c[j++]=a[i];
            c[j++]=b[i++];
        }
        while(i<a.length)
        {
            c[j++]=a[i++];
        }
        while(j<b.length)
        {
            c[j++]=b[i++];
        }
        return c;
    }
    public static void main(String args[])
    {
        System.out.println("Read array ");
        int ar1[]=readArray();
        System.out.println("User enter value");
        disArray(ar1);
        System.out.println("zigzag order even or odd number");
        disArray(zigzag(evenPresent(ar1),oddPresent(ar1)));
    }
    
    
}
