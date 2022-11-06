//write a java program to print all the even number and odd numbers present in the array.
import java.util.Scanner;
public class Q38 {
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
    public static void main(String args[])
    {
        System.out.println("read array");
        int ar1[]=readArray();
        System.out.println("User enter array");
        disArray(ar1);
        System.out.println("even number ");
        disArray(evenPresent(ar1));
        System.out.println("odd number");
        disArray(oddPresent(ar1));
    }

    
}
