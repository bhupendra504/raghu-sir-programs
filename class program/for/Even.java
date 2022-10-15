import java.util.Scanner;
public class Even {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
      //  for(int i=1;i<=n;i++) //
       for(int i=2;i<=n;i=i+2)
        {
            if(i%2==0)
              System.out.println(i);
        }
    }
    
}
