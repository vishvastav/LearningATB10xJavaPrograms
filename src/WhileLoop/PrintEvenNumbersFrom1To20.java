package WhileLoop;

public class PrintEvenNumbersFrom1To20 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=20){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
