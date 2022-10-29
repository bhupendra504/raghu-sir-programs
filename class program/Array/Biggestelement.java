import java.util.Scanner;
public class Biggestelement {
    static int getBiggest(int[]ar)
    {
        int big=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>big)
            big=ar[i];
        }
        return big;
    }
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter the "+n+" integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    static void displayArray(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int[] x=readArray();
        int bg=getBiggest(x);
        System.out.println("biggest is:"+bg);
        
    }
    
    
   
    
}
