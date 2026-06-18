public class ShapeAreaCalculator {
    public static void main (String[] args)
    {
        Shape[] shape = new Shape[5];
        shape[0] = new Rectangle(8,4);
        shape[1] = new Circle(6.2);
        shape[2] = new Triangle(3.4,4);
        for(Shape sh:shape)
        {
           sh.calculateArea();
        }
    }
}
abstract class Shape
{
   public abstract void calculateArea();
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double l,double b)
    {
        this.length=l;
        this.width=b;
    }
    @Override
    public void calculateArea()
    {
        double area= length * width;
        System.out.println("The Area of Rectangle:" +area);
    }
}
class Circle extends Shape{
    final double PI=3.1415;
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public void calculateArea()
    {
        double area= PI*radius*radius;
        System.out.println("The Area of Circle:" +area);
    }
}
class Triangle extends Shape{
    double base;
    double height;
    public Triangle(double b,double h)
    {
        this.base=b;
        this.height=h;
    }
    @Override
    public void calculateArea()
    {
        double area = 0.5 * base *height;
        System.out.println("The Area of Triangle:" +area);
    }
}