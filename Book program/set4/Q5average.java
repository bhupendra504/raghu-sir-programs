import java.util.Scanner;
public class Q5average {
    static double average(int []arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return (double)sum/arr.length;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter the "+n+"double value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
        
    }
    public static void main(String args[])
    {
     System.out.println("Average number "+average(readArray()));
     
    }
    
}
