package WhileLoop;

import java.util.Scanner;

public class Sumofnumbersfrom1to100 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        num = sc.nextInt();
        while (num>=1) {
            sum = sum+num;
            num--;

        }System.out.println(sum);
    }
}
