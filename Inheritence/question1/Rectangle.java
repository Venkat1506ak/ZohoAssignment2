package question1;

public class Rectangle extends Shape {

    Rectangle(int length,int breath){
        super(length,breath);
    }
    double area(){

        return length*breath;
    }
}
