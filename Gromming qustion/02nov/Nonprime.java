import java.util.Scanner;
public class Nonprime {
    static boolean isNonPrime(int n) {
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0)
                return false;
        }
        return true ;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Starting range");
        int start=sc.nextInt();
        System.out.println("Enter the End range");
        int end=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            if(isNonPrime(i)==false)
            {
                sum=sum+i;
            }
        }
        System.out.println("the sumof non prime number betwen " +start+ " to "+ end +" is: "+sum);
    }
}
//output 103213
    

