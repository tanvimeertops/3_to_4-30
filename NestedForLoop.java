import java.lang.StackWalker.StackFrame;

public class NestedForLoop {
    public static void main(String[] args) {
        int i=1,sp=4;
        for (int row = 1; row<=5; row++) {
            for (int space = 1; space<=sp; space++) {
                System.out.print(" ");
                
            }
            for (int star = 1; star<=row*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
            sp--;
        }

    }
}
