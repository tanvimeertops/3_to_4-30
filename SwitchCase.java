
//wap in java to print monday to sunday as per user input.
/*1=monday
 * 2=tuesday
 * 3=wednesday
 */
public class SwitchCase {
    public static void main(String[] args) {
        int ncase=2;
        switch (ncase) {
            case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
            default:
            System.out.println("invalid input");
                break;
        }
    }
}
