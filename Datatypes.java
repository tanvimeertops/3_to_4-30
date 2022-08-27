import java.util.Scanner;

/*variable is a storage container where the specific data is stored.
 * identifier  name of variable
 *      rule of identifier
 *          1.always starts with small letter.
 *          2.word should be seperated with _ or camel case. no space allowed
 *              between word.
 *              eg: num_one   numOne
 *          3.no keyword name is allowed.
 * keyword is a special word whose meaning is already stored in compiler.
 * datatype is a type data. 
 * 1.int,long (numerical)
 * 2.char,string (alphabet)
 * 3.float,double (decimal values) 
 * */
public class Datatypes {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*interger */
        int a;
        long l;
        char ch;
        String str;
        float ft;
        double dd;
        System.out.println("enter a:");
        a=sc.nextInt();
        System.out.println(a);
        System.out.println("enter l:");
        l=sc.nextLong();
        System.out.println(l);
        System.out.println("enter ch:");
        ch=sc.next().charAt(0);
        System.out.println(ch);
        System.out.println("enter string:");
        str=sc.nextLine();
        System.out.println(str);
        System.out.println("enter flaot:");
        ft=sc.nextFloat();
        System.out.println(ft);
        System.out.println("enter double:");
        dd=sc.nextDouble();
        System.out.println(dd);

        /*WAPJ for simple calculator input value from user. */
    }
}
