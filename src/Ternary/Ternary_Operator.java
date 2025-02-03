/*
Step 1 - Find the inputs and outputs - data types and what is the exactly the out put interviewer looking.
Step 2 - Rough logic , brute force - > explain it side by side.
Step 3 - Write the logic and present the solution (Dry Run)
Step 4 - Optimize and discussion.
Step 5 - Edge Cases and extra discussion.
Problem:  Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
                    A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59
                    variable = Expression1 ? Expression2: Expression3
*/
package Ternary;

public class Ternary_Operator {
    public static void main(String[] args) {
        /* Step 1: Input and output
        *  input:
        *  Score float: A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59
        * output : char A,B,C,D,F
        * Step 2: A: 90-100  -> 100 <= && <=90
        *         B: 80-89  ->  89 <= && <=80
        *         C: 70-79  ->  79 <= && <=70
        *         D: 60-69  ->  69 <= && <=60
        *         F: 0-59  ->   59 <=
        * */
        float score = 68.356f;  //input


        char grade = (score >= 60 && score <=69) ? 'D' : (score >= 70 && score <=79) ? 'C': (score >= 80 && score <=89) ? 'B' : (score >= 90 && score <=100) ? 'A': 'F';
        //res=(num1>num2) ? (num1+num2):(num1-num2)
        System.out.println(grade);








    }

}
