/*Array with sorting (asc and dec) 
 * bubble sort (comparision of two value)
*/
public class BubbleSort {
    public static void main(String[] args) {
        int c[]={5,9,2,4,1,3};
        for (int index = 0; index< c.length; index++) {
            for (int i = index+1; i< c.length; i++) {
                if(c[index]<c[i]){
                    int temp= c[index];
                    c[index]=c[i];
                    c[i]=temp;
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
