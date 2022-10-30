import java.util.Scanner;
public class Reverse {
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
    public static void reverseArr(int[] ar)
    {
         int i=0,j=ar.length-1;
        while(i<j)
        {
          int temp=ar[i];
          ar[i]=ar[j];
          ar[j]=temp;
          i++;
          j--;

        }
           
    }
   
    public static void main(String args[])
    {
        int a[]=readArray();
        System.out.println("before reverse");
        disArray(a);
        reverseArr(a);
        System.out.println("After reverse");
        disArray(a);
   

}
    
}
