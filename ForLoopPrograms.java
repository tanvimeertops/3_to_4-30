import java.util.Scanner;

/**
 * unary operator: ++,--
 * Loop: whenever a statement or a logic needs to be executed
 * n no of times.
 * types of loop:
 * 1. for (initialization;condition;incree/decree)
 * 2.while
 * 3.do while
 */
public class ForLoopPrograms {
    public static void main(String[] args) {
        int no,sum=0,i;
       Scanner sc=new Scanner(System.in);
       
        for(i=1;i<=5;i++){
            System.out.println("ENTER A NO:");
            no=sc.nextInt();
            sum=sum+no;
        }
        System.out.println(sum);

            
        
    }
    
}
