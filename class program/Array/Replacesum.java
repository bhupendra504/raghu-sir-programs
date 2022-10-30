import java.util.Scanner;
public class Replacesum {
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
    public static void replaceArr(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            int sum=0,num=ar[i];
            while(num!=0)
            {
                sum=sum+num%10;
                num=num/10;
            }
            ar[i]=sum;
        }
    }
   
    public static void main(String args[])
    {
        int a[]=readArray();
        System.out.println("before replace");
        disArray(a);
        replaceArr(a);
        System.out.println("After replace");
        disArray(a);
   

}
}
    

