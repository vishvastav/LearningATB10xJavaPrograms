package Task;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to guess Even or Odd: ");
        num = sc.nextInt();
        if (num % 2==0){
            System.out.println("Evennnnnnnn Number");
        }else System.out.println("Odddddddd Number");
    }
}
