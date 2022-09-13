import java.util.Scanner;

/*Create a class named 'Member' having the following members:
Data members 
Name
Age
Phone number
Address 
5 - Salary
It also has a method named 'printSalary' which prints the salary of the 
members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
'Employee' and 'Manager' classes have data members 'specialization' and 
'department' respectively. Now, assign name, age, phone number, 
address and salary to an employee and a manager by making an object of 
both of these classes and print the same.*/
class Member{
    protected String name;
    protected  String age;
    protected String phone_number;
    protected String address;
    protected double salary;

 
    public void printSalary(){
        System.out.println("Salary:" +salary);
    }
}
class  Employee extends Member{
String specialization;
void setEmployee(){
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
    age=sc.nextLine();
    phone_number=sc.nextLine();
    address=sc.nextLine();
    salary=sc.nextDouble();
    specialization=sc.nextLine();
}
void getEmployee(){
    System.out.println("name:"+name);
    System.out.println("age:"+age);
    System.out.println("phone_number:"+phone_number);
    System.out.println("address:"+address);
    System.out.println("salary:"+salary);
    System.out.println("specialization:"+specialization);
}
}

class Manager extends Member{
    String department;
}
public class HeirarchicalInheritance{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmployee();
        e.getEmployee();
    }
}