import java.util.Scanner;
public class Q31binarytonumber {
    static String binTonum(int num)
    {
        String bin="";
        do
        {
            int rem=num%2;
            bin=rem+bin;
            num=num/2;
        }
        while(num!=0);
        return bin;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("binary to number "+binTonum(n));
        sc.close();
    }
    
}
