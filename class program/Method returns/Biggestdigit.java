import java.util.Scanner;
public class Biggestdigit {
    
   static int biggestDigit(int n)
   {
    big=-9;
    {
        int r=n%10;
        if(r>big)
         big=r;
         n=n/10;

    }
    while(n!=0)
      return big;
   }
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int x=sc.nextInt();
    System.out.println("biggest "+biggestDigit(x));
}    
}
