package Triangle;

public class RightAngledTriangle {
    public static void main(String[] args) {

        /*
        ------Print O/P-------
        *
        * *
        * * *
        * * * *
        * * * * *

        ----------------------
        */
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*");
            System.out.print(" ");
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("\n");

        }
    }
}
