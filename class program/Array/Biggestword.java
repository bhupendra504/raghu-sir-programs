/*public class Biggestword {
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
    
}*/

public class Biggestword{
    public static String highestLengtName(String[] names)
    {
        String hname=names[0];
        for(int i=1;i<names.length;i++)
        {
            if(hname.length()<names[i].length())
              hname=names[i];
        }
        return hname;
    }
    public static void main(String[] names)
    {
        String name=highestLengtName(names);
        System.out.println("highest length name is: "+name);
    }
}
