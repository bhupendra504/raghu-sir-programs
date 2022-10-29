public class Smallword {
    static String smallWord(String arr[])
    {
        String sml=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i].length()<sml.length())
            {
                sml=arr[i];
            }
        }
        return sml;
    }
    public static void main(String args[])
    {
        String arr[]={"a","abc","abcd"};
        String total=smallWord(arr);
        System.out.println(total);
    }
    
}
