package Triangle;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
         /*
        ------Print O/P-------
        * * * * *
        * * * *
        * * *
        * *
        *
        ----------------------
        */
        for (int i = 1; i<=5 ; i++) {
            System.out.print("*");
            System.out.print(" ");

            for (int j = 3; j>=i-1; j--) {
                System.out.print("*");
                System.out.print(" ");

            }System.out.println("\n");

        }
    }
}
