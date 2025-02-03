package Task;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
//        String name = args[0];
//        System.out.println("Enter your Name: " + args[0]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String countvowel = sc.next();

        countvowel = countvowel.toLowerCase();

        System.out.println(countvowel);


    }
}
