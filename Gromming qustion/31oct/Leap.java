public class Leap {
    public static boolean isLeap(int n)
    {
    if(n%4==0 && n%100!=0 || n%400==0)
    {
     return true;
    }
    else 
    {
        return false;
    }
    
}
public static void main(String args[])
{
    for(int i=2000;i<=2500;i++)
    {
    if(isLeap(i))
    {
        System.out.println(i);
    }
}
}
}


