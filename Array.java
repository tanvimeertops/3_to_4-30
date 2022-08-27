import java.util.Scanner;

//package defaultPackage;
/*Array is a collection of data of same type. 
 * array always starts with 0
 * types of Array
 * 1. 1-D Array
 * 2. 2-D Array /matrix(matrices)
 * 
*/
public class Array {
    /*
     * addition of 2 matrix
     * size of both matrix should be equal.
     */
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int b[][] = {{-1},{5},{6}} ;
        int c[][];
        int sum = 0;
        c = new int[2][1];
        for (int k = 0; k < 1; k++) {
            for (int i = 0; i < 2; i++) {
                for (int index = 0; index < 3; index++) {
                    sum =sum+ a[i][index] * b[index][k];
                }
                System.out.println();
                c[i][k] = sum;
                sum = 0;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
