/*short hand operator +=,-= */
public class Multiplication {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int b[][]={{2,3},{1,0},{6,-1}};
        int c[][],sum=0;
        c=new int[2][2];
        // System.out.println("test");
        for (int k = 0; k < 2; k++) {

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    sum += a[i][j] * b[j][k];

                }
                c[i][k] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print("\t"+c[i][j]);
            }
            System.out.println();
        }
    }
}
