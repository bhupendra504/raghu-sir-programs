import java.util.Scanner;
public class Biggest { 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int big=-9;
        while(n!=0)
        {
            int r=n%10;
            if(r>big)
              big=r;
              n=n/10;
              
        }
        System.out.println(big);
    
      
    }
}
