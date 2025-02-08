package Task;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {

        int age;
        double salary;
        int credit_score;

        Scanner sc =new Scanner(System.in);
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Salary: ");
        salary = sc.nextDouble();
        System.out.println("Credit Score: ");
        credit_score = sc.nextInt();

        if (age >= 18 && age <= 80 && salary >=0 && salary <= 30000 &&  credit_score >=650 && credit_score <=850){
            System.out.println("Congrats You are eligible for a LOAN");
        }else System.out.println("Sorry, you are not eligible for a loan");

        sc.close();




    }
}
