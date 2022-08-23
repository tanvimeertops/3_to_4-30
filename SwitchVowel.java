//wap in java to check vowel or consonant
public class SwitchVowel{
    public static void main(String[] args) {
        char ch='a';
        switch (ch) {
            case 'a':
            case 'e':  
            case 'i':
            case 'o':
            case 'u':
            System.out.println("vowel");
                break;
        
            default:
            System.out.println("consonant");
                break;
        }
    }
}
