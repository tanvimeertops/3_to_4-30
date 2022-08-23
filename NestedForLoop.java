public class NestedForLoop {
    public static void main(String[] args) {
        for (int row = 1; row<=5; row++) {
            for (int col = 1; col<=row; col++) {
                int i=1;
                System.out.print(i);
                i++;
            }

            System.out.println();
        }

    }
}
