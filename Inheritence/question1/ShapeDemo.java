package question1;

public class ShapeDemo
{
    public static void main(String[] args) {
        Shape s=new Rectangle(30,40);
        System.out.println("Area of Rectangle = "+s.area());

        s=new Triangle(30,40);
        System.out.println("Area of Triangle = "+s.area());

        s=new Circle(30);
        System.out.println("Area of Circle= "+s.area());
    }
}
