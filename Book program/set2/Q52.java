public class Q52 {
    public static void main(String args[])
    {
        int arr[]={2,5,4,8,3,7,2};

        System.out.println("Working of for each/enhanced for loop");
        for(int i:arr)
         System.out.print(i+" ");

         System.out.println("\n\n Working of for loop");
         for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    
}
