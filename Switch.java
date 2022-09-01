/*vowels - (a,e,i,o,u) */
public class Switch {
    public static void main(String[] args) {
        char ch='y';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'O':
            case 'I':
            case 'U':   
            System.out.println("vowel");
                break;
        
            default:
            System.out.println("consonant");
                break;
        }
    }

}
