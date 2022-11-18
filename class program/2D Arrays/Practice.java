import java.util.Scanner;
class Practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int f1=0,f2=1;
        do(f1<n)
        {
            System.out.println(f1);
            int f3=f1+f2;
            f3=f2;
            f2=f1;

            
        }

    }
}