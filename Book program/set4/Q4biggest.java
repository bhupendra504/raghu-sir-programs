import java.util.Scanner;
public class Q4biggest {
    static int biggest(int arr[])
    {
        int big=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>big)
            {
                big=arr[i];
            }
        }
           
        return big;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+"integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    public static void main(String args[])
    {
        System.out.println("the biggest element is: "+biggest(readArray()));
    }
    
}
