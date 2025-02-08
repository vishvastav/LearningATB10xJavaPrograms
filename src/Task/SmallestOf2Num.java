package Task;

import java.util.Scanner;

public class SmallestOf2Num {
    public static void main(String[] args) {
        int FirstNumber ;
        int SecondNumber ;

        Scanner sc = new Scanner(System.in);

        System.out.println(" First Number: ");
        FirstNumber = sc.nextInt();

        System.out.println(" Second Number: ");
        SecondNumber = sc.nextInt();

        int SmallestNumber = (FirstNumber < SecondNumber)? FirstNumber:SecondNumber;
        System.out.println("Smallest Number " +SmallestNumber);

    }
}

