/*switch case 
 * //wap in java to print vowel or consonant.
    vowel =a,e,i,o,u
 */
public class Switch2{
    public static void main(String[] args) {
        char choice='v';
        switch (choice) {
            case 'a':
             case 'e' :
             case 'i' :
             case 'o' :
             case 'u' :
             case 'A' :
             case 'E' :
             case 'I' :
                System.out.println("vowel");
                break;
            default:
            System.out.println("consonant");
                break;
        }
    }
}
 
