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
 */
class Box{
    private int length,width,height;
    Box(){
        length=1;
        width=2;
        height=3;
        System.out.println("in default constructor");
    }
    Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
        System.out.println("in parameterised constructor");
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
    }
}
