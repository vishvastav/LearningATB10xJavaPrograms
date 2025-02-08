package Task;

import java.util.Scanner;

public class LargestOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("FirstNumber: ");
        int FirstNumber = sc.nextInt();

        System.out.println("SecondNumber: ");
        int SecondNumber = sc.nextInt();

        System.out.println("ThirdNumber: ");
        int ThirdNumber = sc.nextInt();

        int largest = (FirstNumber>SecondNumber)? FirstNumber:(SecondNumber>ThirdNumber)?SecondNumber:ThirdNumber;
        System.out.println(" Largest Number: " + largest);
    }
}
