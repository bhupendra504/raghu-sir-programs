//write a java program to search the element from the array if it is present return the index of that element otherwise return -1.
import java.util.Scanner;
public class Q31 {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the "+n+" Integer value");
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
    static int presentArray(int [] array,int element)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==element)
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first read array");
        int array[]=readArray();
        System.out.println("Enter the element ");
        int element=sc.nextInt();
        System.out.println("User enter the value");
        disArray(array);
        System.out.println(element+"-------->"+presentArray(array, element));
        sc.close();



    }

    
}
