import java.util.Scanner;
class Sumofoddeven
{
static  int oddSum(int n)
{
int sum=0;
while(n!=0)
{
int r=n%10;
if(r%2!=0)
  sum=sum+r;
n=n/10;
}
return sum;
}
static  int evenSum(int n)
{
 int sum=0;
while(n!=0)
{
int r=n%10;
if(r%2==0)
  sum=sum+r;
n=n/10;
}
return sum;
}
static void passFail(int n)
{
if(oddSum(n)==evenSum(n))
    System.out.println("pass");
else
  System.out.println("fail");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
passFail(x);
}
}





