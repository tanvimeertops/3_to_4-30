import java.util.Scanner;

/*Create a class named 'Member' having the following members:
Data members 
Name
Age
Phone number
Address 5 - Salary
It also has a method named 'printSalary' which prints the salary of the 
members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
'Employee' and 'Manager' classes have data members 'specialization' and 
'department' respectively. Now, assign name, age, phone number, 
address and salary to an employee and a manager by making an object of 
both of these classes and print the same*/
class Member{
    protected String Name,age,ph_no,add;
    protected String sal;
    void printSalary(){
        System.out.println(sal);
    }
}
class Employee extends Member{
String specialization;
void setEmployee(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name:");
Name=sc.nextLine();
System.out.println("Enter age:");
age=sc.nextLine();
System.out.println("Enter phone no:");
ph_no=sc.nextLine();
System.out.println("enter add:");
add=sc.nextLine();
System.out.println("enter salary:");
sal=sc.nextLine();
System.out.println("enter specialization:");
specialization=sc.nextLine();
}
void getEmployee(){
System.out.println("name:"+Name);
System.out.println("age:"+age);
System.out.println("phone no:"+ph_no);
System.out.println("address:"+add);
System.out.println("salary:"+sal);
System.out.println("specialization:"+specialization);
}
}
class Manager extends Member{
String department;
void getManager(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name:");
Name=sc.nextLine();
System.out.println("Enter age:");
age=sc.nextLine();
System.out.println("Enter phone no:");
ph_no=sc.nextLine();
System.out.println("enter add:");
add=sc.nextLine();
System.out.println("enter salary:");
sal=sc.nextLine();
System.out.println("enter specialization:");
department=sc.nextLine();
}
void getEmployee(){
System.out.println("name:"+Name);
System.out.println("age:"+age);
System.out.println("phone no:"+ph_no);
System.out.println("address:"+add);
System.out.println("salary:"+sal);
System.out.println("department:"+department);
}
}
public class InheritanceExample{
    public static void main(String[] args) {
    Employee e=new Employee();
    e.setEmployee();
    e.getEmployee();
    
    }
}