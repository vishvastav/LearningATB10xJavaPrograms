package Task;

import java.util.Scanner;

public class PalidromeofString {
    public static void main(String[] args) {
        //Palidrome of String Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word to convert into palidrome: ");
        String palidrome = scanner.next();
        StringBuffer sb = new StringBuffer(palidrome);
        sb.reverse();
        System.out.println("Your reversed word is " + sb);

        String reversed = sb.toString();

        if (palidrome.equals( reversed)) {
            System.out.println(" YOUR INPUT IS A PALIDROME ");

        }else System.out.println("YOUR INPUT IS NOT A PALIDROME");
    }
}
