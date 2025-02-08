package Task;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to find out if It's a leap year: ");
        year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap Year");
        }else if (year % 4 == 0) {
            System.out.println("Leap Year");
        }else System.out.println("Not a Leap Year");
    }
}
