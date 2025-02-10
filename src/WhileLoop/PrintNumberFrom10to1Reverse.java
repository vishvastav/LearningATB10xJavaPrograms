package WhileLoop;

import java.util.Scanner;

public class PrintNumberFrom10to1Reverse {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        num = sc.nextInt();

        while (num>=1){
            System.out.println(num);
            num--;
        }

    }
}
