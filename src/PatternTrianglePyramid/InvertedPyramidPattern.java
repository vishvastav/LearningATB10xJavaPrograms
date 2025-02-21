package PatternTrianglePyramid;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        /*
        * * * * *
         * * * *
          * * *
           * *
            *
        */
        for (int i = 1; i <= 5; i++) {
            System.out.print("out");
            System.out.print(" ");
            for (int j = 3; j >= i-1; j--) {

                System.out.print("inn");
                System.out.print(" ");

            }System.out.println("\n");

        }
    }
}
