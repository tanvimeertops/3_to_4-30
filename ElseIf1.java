import java.util.Scanner;
/*wap in java to display division. */
/*control statement
 * if
 * if else
 * nested if
 * else if ladder
 * switch
 */
public class ElseIf1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int math,physics,chemistry;
        System.out.print("enter value of math:");
        math=sc.nextInt();
        System.out.print("enter value of physics:");
        physics=sc.nextInt();
        System.out.print("enter value of chemistry:");
        chemistry=sc.nextInt();
        int total=math+physics+chemistry;
        float percentage=total/3;
        System.out.println("percentage:"+percentage);
        if(percentage>=75)
        System.out.println("Distinction");
        else if(percentage>=60)
        System.out.println("first class");
        else if(percentage>=50)
        System.out.println("Second class");
        else if(percentage>35)
        System.out.println("third class");
        else 
        System.out.println("fail");
    }
}
