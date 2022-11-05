import java.util.Scanner;
public class Armstrong {
    static int digitCount(int n)
    {
      int count=0;
      do{
        n=n/10;
        count++;
      }
      while(n!=0);
      return count;
    }
    static int pow(int n,int p)
    {
        int pw=1;
        while(p>0)
        {
            pw=pw*n;
            p--;
        }
        return pw;
    }
    static boolean isArmstrong(int n)
    {
        int sum=0,temp=n;
        int dc=digitCount(n);
        do{
            int rem=n%10;
            sum=sum+pow(rem,dc);
            n=n/10;
        }
        while(n!=0);
        return temp==sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start range");
        int start=sc.nextInt();
        System.out.println("Enter the end range");
        int end=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            if(isArmstrong(i))
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of Armstrong number from "+start+" to "+end +"is: "+sum);
    }
   
     
}

