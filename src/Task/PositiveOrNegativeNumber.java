package Task;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = sc.nextInt();
        if (num<0){
            System.out.println("Your number is a negative number.");
        }else System.out.println("Your number is a positive number.");

    }
}
