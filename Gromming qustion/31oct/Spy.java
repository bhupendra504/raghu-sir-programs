public class Spy {
    public static boolean isSpy(int n)
    {
        int prod=1;
        int sum=0;

        do
        {
            int rem=n%10;
            prod=prod*rem;
            sum=sum+rem;
            n=n/10;
        }
        while(n!=0);
        return sum==prod;
    }
    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
        {
            if(isSpy(i))
            {
                System.out.println(i);
            }
        }
    }
    
}
