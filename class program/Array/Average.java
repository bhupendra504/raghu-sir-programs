import java.util.Scanner;
public class Average {
    public static int[] userInput()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    return arr;
}
public static double Aug(int[] arr)
{
    int sum=0;
    double avg=0;
    for(int i=0;i<arr.length;i++)
    {
     sum=sum+arr[i];
    }
    System.out.println(sum);
    avg=sum/arr.length;
    return avg;
}
public static void main(String args[])
{
    int a[]=userInput();
    double val=Aug(a);
    System.out.println("Average :"+val);
}
 

    
    
}
