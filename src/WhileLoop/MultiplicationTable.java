package WhileLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        int table = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        num = sc.nextInt();

        while (table<=10) {
            int MulTable;
            MulTable = table*num;
            table++;
           System.out.println(MulTable);
        }

    }
}
