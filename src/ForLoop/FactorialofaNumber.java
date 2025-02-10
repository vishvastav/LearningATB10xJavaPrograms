package ForLoop;

import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        int fact=1;
        for (int i = number; i >=1; i--  ){
            fact= fact*i;
           // System.out.println(fact);
            //sum = sum*fact;
            //System.out.println(sum);

        }
        System.out.println(fact);
    }
}
