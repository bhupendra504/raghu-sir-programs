import java.util.Scanner;
class Q1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();

        if(a%5==0&&a%3==0)
        {
            System.out.println("fizzbuzz");
        }
        else if(a%3==0)
        {
            System.out.println("fizz");
        }
        else if(a%5==0)
        {
            System.out.println("buzz");
        }
        else 
        {
            System.out.println("no");
        }
    }
}