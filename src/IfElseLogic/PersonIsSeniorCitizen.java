package IfElseLogic;

import java.util.Scanner;

public class PersonIsSeniorCitizen {
    public static void main(String[] args) {
        /*Find if a Person is Senior Citizen Based on Age.
         :- take the age input from the user.
        Implement Age Category Logic:
Define the criteria for different age categories:
Child: Age 0 to 12
Teenager: Age 13 to 19
Adult: Age 20 to 64
Senior Citizen: Age 65 and older*/
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Site Url: ");
        age = sc.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior Citizen");

        }
    }
}
