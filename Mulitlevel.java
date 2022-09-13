/*Mutilevel inheritace */
import java.util.Scanner;

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
class C extends B{
    int c;
    void setC(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter c:");
        c=sc.nextInt();
    }
    void getC(){
        System.out.println(c);
    }
}
public class Mulitlevel {
    public static void main(String[] args) {
        C c =new C();
        c.setA();
        c.setB();
        c.setC();
        c.getA();
        c.getB();
        c.getC();
    }
}
