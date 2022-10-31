
public class Q1percentage
{
    public static void main(String args[])
    {
        double[] per={78.87,65.87,45.67,76.43,98.08};
        double big=per[0];
        for(int i=0;i<per.length;i++)
        {
            if(per[i]>big)
            {
                big=per[i];
            }
        }
        System.out.println("the highest percentage "+big);
    }
}

  