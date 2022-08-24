//logical operator(&&,||,!)
/*vowel a,e,i,o,u 
 * relational operator(<,>,<=,>=,==,!=)
 * Write a Java program that takes the user to provide a single character 
from the alphabet. Print Vowel or Consonant, depending on the user 
input. If the user input is not a letter (between a and z or A and Z), or is a 
string of length > 1, print an error message.

*/
package defaultPackage;
public class LogicalOperatorIfElse {
   
   public static void main(String[] args) {
    char ch='1';
   
    if(Character.isDigit(ch)){
        System.out.println("Please a single character");
    }
    else{
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A')
    System.out.println("vowel");
    else
    System.out.println("consonant");
    }
   } 
}
