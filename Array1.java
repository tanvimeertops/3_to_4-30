//collection of data of similar type.
//array out of bound index
//1-d array
//2-d array
//add,sub
//both the matrix should have same size.

public class Array1 {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4},{5,6}};
        int b[][]={{10,20},{30,40},{50,60}};
        for (int i = 0; i<3; i++) {
                for (int index = 0; index < 2; index++) {
                    System.out.print(a[i][index]-b[i][index]+"  ");
                }
                System.out.println();
           
        }
    }
}
