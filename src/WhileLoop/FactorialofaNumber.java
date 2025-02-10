package WhileLoop;

import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {
        int num;
        int FactTable=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        num = sc.nextInt();

        while (num>=1) {
            FactTable = (num*FactTable);
            num--;

        }System.out.println(FactTable);
    }
}
