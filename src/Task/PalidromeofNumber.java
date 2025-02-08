package Task;

import java.util.Scanner;

public class PalidromeofNumber {
    public static void main(String[] args) {
        //Palidrome of String Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word to convert into palidrome: ");

        int palidrome = scanner.nextInt();

        String s = String.valueOf(palidrome);

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("Your reversed number is " + sb);

        String reversed = sb.toString();

        if (s.equals( reversed)) {
            System.out.println(" YOUR INPUT IS A PALIDROME ");

        }else System.out.println("YOUR INPUT IS NOT A PALIDROME");
    }
}
