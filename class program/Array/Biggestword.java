public class Biggestword {
    static String bigWord(String arr[])
    {
        String bigname=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i].length()>bigname.length())
            {
                bigname=arr[i];
            }
        }
        return bigname;
    }
    public static void main(String args[])
    {
        String arr[]={"a","abc","abcd"};
        String total=bigWord(arr);
        System.out.println(total);
    }
    
}
