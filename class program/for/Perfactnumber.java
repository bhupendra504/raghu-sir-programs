import java.util.Scanner;
public class Perfactnumber {
    static boolean isPerfact(int x)//6
    {
        int sum=0;
        for(int i=1;i<=x/2;i++)
        {//6
            if(x%i==0)
             sum=sum+i;
        }
        return sum==x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean rs=isPerfact(n);
        if(rs==true)
        {
            System.out.println(n+" is a perfact number");
        }
          else 
          {
            System.out.println(n+" is a not perfact number");
          }
          
    }
    
}
