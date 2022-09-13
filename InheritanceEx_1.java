/*Create a class with a method that prints "This is a parent class"
and its subclass with another method that prints "This is child class".
 Now, create 
an object for each of the class and call 
1 - method of parent class by object of parent class
 2 - method of child class by object of child class 
 3 - method of parent class by object of child class*/
class A{
    void show(){
        System.out.println("This is a parent class");
    }
}
class B extends A{
    void display(){
        System.out.println("This is child class");
    }
}

public class InheritanceEx_1{
    public static void main(String[] args) {
      A a=new A();
      a.show();
      B b =new B();
      b.display();
      b.show();
    }
}