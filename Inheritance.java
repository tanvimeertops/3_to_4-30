import java.util.Scanner;

/*Inheritance: inherit the atrribute of parent into child.
 * creating a class from an existing class.
 * types of inheritance:
 * 1.single
 * 2.multilevel
 * 3.multiple :multiple parent
 * Ambiguity when both the parent have same function name then 
 * the object is not sure which one to call
 * it can done using interface.
 * 4.heirarchical: one parent and multiple child
 * 5.hybird : multiple+heirarchical
 * parent/base/super
 * child/derived/sub/inherited
 * object will be created for child only.
 * Advantage:
 * 1. code reusability
 * 2. less object creation.
 * 
 */
/*1.single inheritance */
class A{
    int a;
    void setA(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        a=sc.nextInt();
    }
    void getA(){
        System.out.println(a);
    }
}
class B extends A{
    int b;
    void setB(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter b:");
        b=sc.nextInt();
    }
    void getB(){
        System.out.println(b);
    }
}
public class Inheritance{
public static void main(String[] args) {
    B b=new B();
    b.setA();
    b.setB();
    b.getA();
    b.getB();
}
}