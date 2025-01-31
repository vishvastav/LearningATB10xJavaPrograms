package Task;

import java.util.Scanner;
//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
public class MaxBetweenTwoInput {
    public static void main(String[] args) {
        int firestnumber = 0;
        int secondnumber = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        firestnumber = sc.nextInt();
        System.out.println("Enter Second Number: ");
        secondnumber = sc.nextInt();

        int largestnumber = (firestnumber > secondnumber) ? firestnumber :secondnumber;
        System.out.println("Largest number of the two: " +largestnumber);

    }
}
