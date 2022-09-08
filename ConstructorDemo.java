import java.util.Scanner;

/*
 * class : collection of data member and member function.
 * object: gives the permission to access the functionality of the class.
 * inheritance
 * polymorphism
 * encapsulation
 * abstraction
 */
/*constructor: constructor is a special member function 
whose task is to initialise the object.
 * characteristics of constructor
 * same name as class name.
 * it should have no return type
 * it invokes automatically whenever the objects are created.
 * 
 * Types of constructor
 * 1.Default (no parameter)
 * 2.Parameterised (parameter)
 * 3.copy(object as argument) //cloning of object. 
 -->constructor overloading : same name different parameter
 in java object are stored in heap memory.
 java has automatic memory management
 garbage collector: whenever the objects are no longer required 
 it is destroyed by garbage collector.
 it is present in jvm
 error : virtual memory error

 */
class Box{
    private int length,width,height;
    Scanner sc=new Scanner(System.in);
    
    Box(){

        // length=1;
        // width=2;
        // height=3;

        System.out.println("Enter length:");
        length=sc.nextInt();
        System.out.println("Enter length:");
        width=sc.nextInt();
        System.out.println("Enter length:");
        height=sc.nextInt();
    }
    Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
        System.out.println("in parameterised constructor");
    }

    Box(Box b){
        System.out.println("in copy constructor");
            length=b.length;
            width=b.width;
            height=b.height;
    }
    void volume(){
        System.out.println("volume:"+length*width*height);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Box dc=new Box();
       dc.volume();
       Box pc=new Box(4, 5, 6);
       pc.volume();
       Box cc=new Box(pc);
       cc.volume();
    }
}
