/* heirarchical*/
//
class parent1{
    protected int a,b;
}
class child1 extends parent1{
void multi(){
    int multi;
    a=10;
    b=20;
        multi= a*b;
        System.out.println(multi);
}
}
class child2 extends parent1{
void cube(){
    a=3;
    b=2;
    System.out.println(a*a*a);
    System.out.println(b*b*b);
}
}
public class Heirachicalinheritance {
    public static void main(String[] args) {
        child1 ch1=new child1();
        child2 ch2=new child2();
        ch1.multi();
        ch2.cube();
    }
}
