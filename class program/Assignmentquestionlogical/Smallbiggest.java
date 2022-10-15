import java.util.Scanner;
public class Smallbiggest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int small=9;
        int biggest=-9;
        while(n!=0)
        {
            int r=n%10;
            if(small>r)
            {
                small=r;
            }
            if(biggest<r)
            {
                biggest=r;
            }
            n=n/10;
        }
        System.out.println(small+biggest);
    }
}
    

