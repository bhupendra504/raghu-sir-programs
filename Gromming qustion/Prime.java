public class Prime {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String args[]) {
        int sum=0;
       for(int i=1;i<=50;i++)
       {
        if(isPrime(i))
        {
          sum=sum+i;
        }
       }
       System.out.println("sum or prime number  "+sum);
    }
}


