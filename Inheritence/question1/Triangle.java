package question1;

public class Triangle extends Shape {
    Triangle (int length,int breath){
        super(length, breath);
    }
    double area(){
        return  0.5*length*breath;
    }
}
