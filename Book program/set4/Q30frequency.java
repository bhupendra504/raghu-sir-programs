//Write a java program to define a method to rpint frequency of each array elements.
public class Q30frequency {
    public static void main(String args[])
    {
        int ar[]={23,45,56,45,58,45,58,25};
        int big=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(big<ar[i])
             big=ar[i];
        }
        int count[]=new int [big+1];
        for(int i=0;i<ar.length;i++)
        {
            count[ar[i]]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
             System.out.println(i+"------------>"+count[i]);
        }
    }
    
}
