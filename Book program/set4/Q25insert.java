import java.util.Scanner;
public class Q25insert {
    static int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the " +n+ " integer value");
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
    public static int[] insertArrayAtIndex(int[] array, int[] secArray, int index) {
        if(index < 0 || index > array.length) {
            System.out.println("Error: Index out of range.");
            return array;
        }

        int[] newArray = new int[array.length + secArray.length];
        int i=0, j=0, k=0;

        while(i < newArray.length) {
            if(i<=index) {
                newArray[i++] = array[k++];
            }
            else {
                while(j<secArray.length) {
                    newArray[i++] = secArray[j++];
                }
                while(k<array.length) {
                    newArray[i++] = array[k++];
                }
            }
        }

        return newArray;
    }
   
           
    public static void main(String args[])
    {
        System.out.println("Read first array");
        int array[]=readArray();
        System.out.println(" Read Second array");
        int secArray[]=readArray();
       System.out.println("user entred first array");
       System.out.println("");
       disArray(array);
       System.out.println("user entred second array");
       System.out.println("");
       disArray(secArray);
       int c[]=insertArrayAtIndex(array, secArray, 0);
       System.out.println("insert the two Array");
       disArray(c);



    }
    
}
