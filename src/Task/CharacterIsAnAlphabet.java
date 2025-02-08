package Task;

import java.util.Scanner;

public class CharacterIsAnAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your character: ");

        char alphabet = sc.next().charAt(0);

        if ('a'<= alphabet && alphabet >='z'){
            System.out.println("Your char is alphabet is "+ alphabet);
        } else if ('A'<= alphabet && alphabet >='Z') {
            System.out.println("Your char is alphabet is "+ alphabet);
        }else System.out.println("Your char is not a valid alphabet.");
    }
}
