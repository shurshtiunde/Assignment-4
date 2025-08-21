class Flower
{
String color="Orange";
}
public class Rose extends Flower
{
String color="Red";
{
System.out.println("The color is: " +super.color);
System.out.println("The color is: " +color);
}
public static void main(String[] args)
{
Rose r=new Rose();
}
}

