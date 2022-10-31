import java.util.Scanner;
public class Q17 {
    static boolean oddNumber(int n)
    {
        if(n>1000 ||n<100)
        {
            return false;
        }
        else 
        {
            if(n%2!=0)
            {
                return true;
            }
        }
        return false;
    }
    static int countDigit(int ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(oddNumber(ar[i]))
            {
                count++;
            }
        }
        return count;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+n+"integer value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void main(String args[])
    {
        System.out.println("the number of odd number between 100 and 1000 "+countDigit(readArray()));
    }
    
    
}
