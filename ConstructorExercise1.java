class Student{
    private String name;
    Student(){
        name="Unknown";
    }
    Student(String n){
        name=n;
    }
    void display(){
        System.out.println(name);
    }
}
public class ConstructorExercise1 {
    public static void main(String[] args) {
        Student sd =new Student();
        sd.display();
        Student sp=new Student("kinjal");
        sp.display();
    }
}
