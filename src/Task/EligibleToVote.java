package Task;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        String EligibleForVote = (age < 18)? "You are not Eligible to Vote." : "You are Eligible to Vote.";
        System.out.println(EligibleForVote);

    }
}
