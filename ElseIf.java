//wap to find division of a student.
/*
 * >75 -distinction
 * >60 && <=75 first
 * >50 && <=60 second
 * >35 && <=50 third 
 * fail.
 * 
 */
public class ElseIf {
    public static void main(String[] args) {
        int percentage=75;
        if(percentage>75){
            System.out.println("distinction");
        }
        else if(percentage>60&&percentage<=75){
            System.out.println("first");
        }
        else if(percentage<=60&&percentage>50){
            System.out.println("second");
        }
        else if(percentage<=50&&percentage>35){
            System.out.println("third");
        }
        else 
        System.out.println("fail");
    }
}
