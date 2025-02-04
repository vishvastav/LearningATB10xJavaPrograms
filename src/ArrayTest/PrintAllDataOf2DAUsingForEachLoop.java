package ArrayTest;


public class PrintAllDataOf2DAUsingForEachLoop {
    public static void main(String[] args) {
        int twoDArrayInitialize[][] = {{1, 2, 3},{4,5,6},{7,8,9}};
        for(int[] rows : twoDArrayInitialize){
            for(int data : rows){
                System.out.println(data);
            }
            System.out.println();
        }
    }
}
