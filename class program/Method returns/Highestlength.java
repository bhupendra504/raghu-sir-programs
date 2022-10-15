import java.util.Scanner;
class Highestlength{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()>b.length())
        {
            System.out.println("highestlength "+a);

        }
        else
        {
            System.out.println("highestlength "+b);
        }
    }
}