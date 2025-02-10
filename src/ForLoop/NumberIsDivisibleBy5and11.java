package ForLoop;

import java.util.Scanner;

public class NumberIsDivisibleBy5and11 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        if (number % 5==0 && number % 11==0 ){
            System.out.println("Number is divisible by both the number 5 and 11.");
            }
        else System.out.println("Number is not divisible by both the number 5 and 11.");

        }
    }

