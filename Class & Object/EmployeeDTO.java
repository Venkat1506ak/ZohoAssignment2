
import java.util.Scanner;


class EmployeeDTO{
    //private static int employeecount=0;

    private int employeeid;
    private String name;
    private String department;
    private double salary;

    private String phonenumber;

    public EmployeeDTO(int employeeid,String name,String department,double salary,String phonenumber){
        this.employeeid=employeeid;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.phonenumber=phonenumber;
        
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void displayEmployee(){
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int noOfEmp=sc.nextInt();
        EmployeeDTO[] emp=new EmployeeDTO[noOfEmp];
        for(int i=0;i<noOfEmp;i++){
            System.out.println("Enter the employee ID:");
            int empId = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            System.out.println("Enter the employee name:");
            String empName = sc.nextLine();

            System.out.println("Enter the employee department:");
            String empDept = sc.nextLine();

            System.out.println("Enter the employee salary:");
            double empSalary = sc.nextDouble();

            System.out.println("Enter the employee phone number:");
            String empPhone = sc.next();

            emp[i]=new EmployeeDTO(empId,empName,empDept,empSalary,empPhone);
        }

        for(EmployeeDTO n : emp){
            n.displayEmployee();
        }
    }
}