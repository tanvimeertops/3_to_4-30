import java.util.Scanner;

/*java runs on both compiler as well as on interpreter
 * compiler executes the whole together eg:c,c++,java (faster)
 * interpreter executes the program line wise. eg:java,javascrpit,python
 * javac (java compiler) converts the java code into binary
 * jdk(java development kit) jvm(java virtual machine)  interpreter
 * datatype :int,float,double,char,long int,string
 * keyword : special word whose meaning is already stored in the compiler.
 * function is a block of code where the main business logic is written.(){}
 * types of function:
 * 1.user define
 * 2.inbuilt 
 * return type: void is return which itself returns nothing.
 * keywords
 * 1. static is a keyword which does not need any object to call the method.
 * class will call the static method.
 * 2. final
 * 3. super
 * 4. this
 * Access specifier/modifier it gives visibility and access to the member.
 * public :accessible and visible to all.
 * private
 * protected
 * default
 * oops concept
 * 1. class is collection of data member(variable) and member funtion .
 * 2. object gives permission to access the functionality of a class
 * 3. inheritance
 * 4. polymorphism
 * 5. encapsulation
 * 6. abstraction.
 * datatype: type of data
 * variable is a storage container of a specific type.
 */
public class FirstClass {
    public static void main(String[] b) {
        Scanner sc=new Scanner(System.in);
    long num_one,num_two,sum;
    //float num_one,num_two,sum;
    //char num_one,num_two,sum;
   // String num_one,num_two,sum;

        System.out.print("Enter num one:");
        //num_one=sc.next().charAt(0);
        num_one=sc.nextLong();
        System.out.println("Enter num two:");
        //num_two=sc.next().charAt(0);
        num_two=sc.nextLong();
        //sum=num_one+num_two;
        System.out.println("sum:"+num_one);
        System.out.println("sum:"+num_two);
    }
    
}
