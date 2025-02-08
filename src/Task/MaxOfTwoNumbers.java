package Task;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        int FirstNumber ;
        int SecondNumber ;

        Scanner sc = new Scanner(System.in);

        System.out.println(" First Number: ");
        FirstNumber = sc.nextInt();

        System.out.println(" Second Number: ");
        SecondNumber = sc.nextInt();

        int LargestNumber = (FirstNumber > SecondNumber)? FirstNumber:SecondNumber;
        System.out.println(LargestNumber);

    }
}
