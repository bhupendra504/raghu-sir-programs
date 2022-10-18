public class Q47student {
    String name,id,stream;
    public Q47student(String name,String id,String stream)
    {
        this.name=name;
        this.id=id;
        this.stream=stream;
    }
    @Override
    public String toString()
    {
        return name+"  "+id+" "+stream;
    }
    public static void main(String args[])
    {
        Q47student s=new Q47student("name","id","stream");
        System.out.println(s);
    }
    
    
}
