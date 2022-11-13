//write a java program to define a method to merge 2 array elements into songle array in zigzag order.

import java.util.Scanner;
public class Q26zigzag {
    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the " + n + " integer value");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
    
        return ar;
        
    }

    static void disArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }
    public static int[] zigzag(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
        int i=0,j=0;
        while(i<a.length&&j<b.length)
        {
            c[j++]=a[i];
            c[j++]=b[i++];
        }
        while(i<a.length)
        {
            c[j++]=a[i++];
        }
        while(j<b.length)
        {
            c[j++]=b[i++];
        }
        return c;
    }
    public static void main(String args[])
    {
        System.out.println("Read first array");
        int a[]=readArray();
        System.out.println("Second first array");
        int b[]=readArray();
        System.out.println("user entred first array");
        disArray(a);
        System.out.println("user entred second array");
        disArray(b);
 
        int c[]=zigzag(a, b);
        System.out.println("merged array element");
        disArray(c);
       
    }

    
}                  