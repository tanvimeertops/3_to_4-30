import java.lang.StackWalker.StackFrame;

public class NestedForLoop {
    public static void main(String[] args) {
        //ch i='A';
        for (int row = 1; row<=5; row++) {
            for (int space = 4; space>=row; space--) {
                System.out.print(" ");
                
            }
            for (int star = 1; star<=row*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
            //sp--;
        }

    }
}
