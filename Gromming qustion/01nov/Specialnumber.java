import java.util.Scanner;

public class Specialnumber {
    static boolean specialNumer(int n) {
        int sum=0,prod=1,temp=n;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            prod=prod*rem;
            n=n/10;
        }
        return sum+prod==temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start range");
        int start=sc.nextInt();
        System.out.println("Enter the ending range");
        int end=sc.nextInt();
        sc.close();
        for(int i=start;i<=end;i++)
        {
            if(specialNumer(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    
}
