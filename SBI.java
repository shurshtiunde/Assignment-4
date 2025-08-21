class RBI
{
public int roi()
{
return 7;
}
}
public class SBI extends RBI
{
public int roi()
{
return 8;

}
public static void main(String args[])
{
SBI s=new SBI();
int a = s.roi();
System.out.println("rate of intrest is:"+a);
}
}
