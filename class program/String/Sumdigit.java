import java.util.Scanner;
public class Sumdigit {
    static int sumofDigit(String st)
    {
        int sum=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);

            if(ch>='0' && ch<='9')
             sum=sum+ch-48;
        }
        return sum;
    }
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int sum=sumofDigit(st);
        System.out.println("Sum of Digit "+sum);
    }
    
}
