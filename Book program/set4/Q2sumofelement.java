import java.util.Scanner;
public class Q2sumofelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of anarray");
        int n=sc.nextInt();
        int [] ar=new int[n];
        System.out.println("Enter the "+n+"Integer value");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("sum of array element is:"+sum);
        sc.close();
    }
    
}
