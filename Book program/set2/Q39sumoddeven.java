import java.util.Scanner;
class Q39sumoddeven
{
    static int sumOfeven(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2==0)
             sum=sum+r;
             n=n/10;
        }
        return sum;
    }
    static int sumOfodd(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2!=0)
             sum=sum+r;
             n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rs=((sumOfodd(n))-(sumOfeven(n)));
        System.out.println(rs);
        sc.close();
    }
}