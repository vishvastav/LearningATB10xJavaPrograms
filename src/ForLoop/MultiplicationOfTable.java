package ForLoop;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(number*i);
        }
    }
}
