package Task;

import java.util.Scanner;

public class ATMWithdrawalSimulation {
    public static void main(String[] args) {
         int AccountBalance = 10000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Withdraw Amount: ");
        int WithdrawAmount = sc.nextInt();
//        //Check withdrawal conditions:
//        1. The amount should be greater than zero.//
//        2. The amount should be a multiple of 100 (common ATM rule).//
//        3. The amount should not exceed the account balance.
//        4. Deduct the amount from the balance if conditions are met.
//        5. Display the updated balance or an error message if the withdrawal fails.
        if (WithdrawAmount > 0 && WithdrawAmount<AccountBalance && WithdrawAmount%100==0){
            AccountBalance = AccountBalance - WithdrawAmount;
            System.out.println("Account Balance: "+AccountBalance);
        }
        else if (WithdrawAmount>AccountBalance) {
            System.out.println("Insufficient Balance");
        }
        else if (WithdrawAmount > 0|| WithdrawAmount%100!=0) {
            System.out.println("Please Enter Amount in multiple of 100");
        }


    }
}
