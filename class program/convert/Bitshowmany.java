public class Bitshowmany {
    static int countsettedBits(int x)
    {
        int count=0;
        do{
            count=count+x%2;
            x=x/2;
        }
        while(x!=0);
        return count;
    }
    public static void main(String args[])
    {
        System.out.println(countsettedBits(45));
    }
    
}
