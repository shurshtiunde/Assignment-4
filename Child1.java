class Parent
{
public void display()
{
System.out.println("Pradip");
}
}
public class Child1 extends Parent
{
public void display()
{
super.display();
System.out.println("Shrushti");
}
public static void main(String[] args)
{
Child1 c=new Child1();
c.display();

}
}