public class hextodec {
    static int hetodec(String hx)
    {
        int dec=0,pw=1;
        for(int i=hx.length()-1;i>=0;i--)
        {
            char ch=hx.charAt(i);
            if(ch>='A' && ch<='Z')
             dec=dec+(ch-55)*pw;
             else if(ch>='a' && ch<='z')
             dec=dec+(ch-87)*pw;
             else if(ch>='0' &&ch<='9')
             dec=dec+(ch-48)*pw;
             pw=pw*16;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(hetodec("2aB"));
    }
    
}
