/*public class Frequency {
    public static void main(String args[])
    {
        int ar[]={23,45,56,45,58,45,58,25};
        int big=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(big<ar[i])
             big=ar[i];
        }
        int count[]=new int[big+1];
        for(int i=0;i<ar.length;i++)
        {
            count[ar[i]]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            System.out.println(i+"----->"+count[i]);
        }
    }
    
}
*/
import java.util.Scanner;
class Frequency
{
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the number"+n+"integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    static void disArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void printFrequency(int ar[])
    {
        boolean rs[]=new boolean[ar.length];
        for(int i=0;i<ar.length;i++)
        {
            if(rs[i]==false)
            {
                int count=1;
                for(int j=i+1;j<ar.length;j++)
                {
                    if(ar[i]==ar[j])
                    {
                        count++;
                        rs[j]=false;
                    }
                }
                System.out.println(ar[i]+" "+count);
            }
        }
    }
    public static void main(String args[])
    {
        int a[]=readArray();
        System.out.println("before ");
        disArray(a);
        printFrequency(a);
     


    }
   
}
