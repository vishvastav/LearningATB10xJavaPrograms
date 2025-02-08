package Task;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check Prime Number: ");

        num = sc.nextInt();

        for (int i = 1; i<num; i++){
            if (num%i==0){
                System.out.println("Number is not a prime number.");
            }
            System.out.println("It's a prime number.");

        }


    }
}
