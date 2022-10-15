import java.util.Scanner;
public class Oddcount {
    static int oddCount(int n)
    {
        int count=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2!=0)
            count++;
            n=n/10;
        }
        return count;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(oddCount(x));
    }
    
}
