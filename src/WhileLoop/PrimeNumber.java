package WhileLoop;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int Primenum;
        int i = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        Primenum = sc.nextInt();
        int num = Primenum;
        boolean isPrime;

        while (Primenum >= i ) {
            if (Primenum % i != 0) {

                isPrime = false;
                i++;
            }isPrime = true;

            if (isPrime = true) {
                System.out.println("Prime number");
            }
            System.out.println("Not a Prime Number");
        }

    }
}
