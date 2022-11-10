//hoe to print Assending order in sentance.
import java.util.Scanner;
import java.util.Arrays;
public class Ascendingsentance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        String str[]=st.split(" ");
        Arrays.sort(str);

        st="";
        for(int i=0;i<str.length;i++)
        {
            st=st+str[i];

            if(i<str.length)
             st=st+" ";
        }
        System.out.println(st);
        sc.close();
    }
    
}
