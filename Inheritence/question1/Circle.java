package question1;

public class Circle extends Shape {
    Circle(int radius){
        super(radius);
    }
    double area(){
        return 3.14*radius*radius;
    }
}
