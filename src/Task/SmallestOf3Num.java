package Task;

import java.util.Scanner;

public class SmallestOf3Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("FirstNumber: ");
        int FirstNumber = sc.nextInt();

        System.out.println("SecondNumber: ");
        int SecondNumber = sc.nextInt();

        System.out.println("ThirdNumber: ");
        int ThirdNumber = sc.nextInt();

        int smallestNumber = (FirstNumber<SecondNumber)? FirstNumber:(SecondNumber<ThirdNumber)?SecondNumber:ThirdNumber;

            System.out.println("Smallest Number: " + smallestNumber);
    }
}
