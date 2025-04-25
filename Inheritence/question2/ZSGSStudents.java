package question2;

public class ZSGSStudents extends Student{
    String batch;
    ZSGSStudents(String name,String batch){
        super(name);
        this.batch=batch;
        System.out.println();
    }
    ZSGSStudents(String name,int age,String batch){
        super(name,age);
        this.batch=batch;
    }

}
