import java.util.Scanner;
public class Q38perfactnumber {
    static boolean perFact(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
             sum=sum+i;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(perFact(n)==true)
          System.out.println("perfact number");
          else 
           System.out.println("not perfact number");
     
    }
    
}
