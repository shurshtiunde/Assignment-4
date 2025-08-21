class Friends
{
public Friends(String name)
{
System.out.println("The Friend is: "+name);
}
}
public class Shrushti extends Friends
{
public Shrushti()
{
super("Sakshi");
System.out.println("In the Shrushti Constructor");
}
public static void main(String[] args)
{
Shrushti s=new Shrushti();
}
}
