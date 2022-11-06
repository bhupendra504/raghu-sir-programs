//write a java program to define a method to print the magic values the array.
import java.util.Scanner;
public class Q29magic {
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
    static void magicValue(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int temp=a[i];
            while(temp>9)
            {
                int sum=0;
                while(temp!=0)
                {
                    int rem=temp%10;
                    sum=sum+rem;
                    temp=temp/10;
                }
                temp=sum;
                
            }
            if(temp==1)
                {
                    System.out.println(a[i]+" ");
                }
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter the read Array");
        int a[]=readArray();
        System.out.println("User enter the value");
        disArray(a);
        System.out.println("print magic value");
        magicValue(a);

    }
    
}
