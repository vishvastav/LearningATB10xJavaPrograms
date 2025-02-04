package ArrayTest;

public class AllTheDataFrom2DArray {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9 */
        int twoDArrayInitialize[][] = {{1, 2, 3},{4,5,6},{7,8,9}};
        for(int i = 0; i<twoDArrayInitialize.length;i++){
           // System.out.println("outer loop");

            for (int j = 0; j <twoDArrayInitialize[i].length;j++){
              //  System.out.println("Inner loop");
                System.out.print(twoDArrayInitialize[i][j]);
                System.out.print("\t");

            }System.out.println(" " );

        }

    }
}
