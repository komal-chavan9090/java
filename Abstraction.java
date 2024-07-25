abstract class Shape 
{
    String color;

    abstract double calculateArea();

    public abstract String toString();

    public Shape(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
}

class Circle extends Shape
{
    double radius;

    public Circle(String color, double radius)
    {
        super(color);
        this.radius=radius;
    }

    @Override double calculateArea()
    {
        return Math.PI*radius*radius;
    }

    @Override public String toString()
    {
        return "Circle[color="+super.color+", radius="+radius+", area="+calculateArea()+"]";
    }
}

class Rectangle extends Shape
{
    double length;
    double width;

    public Rectangle(String color, double length, double width)
    {
        super(color);
        this.length=length;
        this.width=width;
    }

    @Override double calculateArea()
    {
        return length*width;
    }

    @Override public String toString()
    {
        return "Rectangle[color="+super.color+", length="+length+", width="+width+", area="+calculateArea()+"]";
    }
}

public class Abstraction 
{
    public static void main(String[] args)  
    {
        Shape s1=new Circle("yellow",5);
        Shape s2=new Rectangle("red",60,70);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}