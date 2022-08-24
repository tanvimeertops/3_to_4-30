/*control statement whenever there is a decision to make
 * if
 * if else
 * nested if
 * else if ladder
 * switch
 */
//greatest of two nos.
package defaultPackage;
public class ControlStatement {

    public static void main(String[] args) {
        int a=1000,b=200,c=3000;
        if (a > b) {
           if(a>c)
           System.out.println("A is greater");
           else
           System.out.println("c is greater");
        }

        else {
            if(b>c)
            System.out.println("B is greater");
            else
            System.out.println("C is greater");
            
        }

    }
}
