package Task;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        float Units;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please prvide no of units: ");

        Units = sc.nextFloat();

        float multiplier1 = 0.50f;
        float multiplier2 = 0.75f;
        float multiplier3 = 1.20f;
        float multiplier4 = 1.50f;
// 1000, 900,800,700
         if (Units<=100){
            float amount1 = Units * multiplier1 ; //First 100 units  100-900 ==50
            float sum = amount1;//+  (amount2 * multiplier2);

            System.out.println("Your  Electricity Bill is: " + sum);

        } else if (Units>100 && Units <=200){
             float amount1 = Units - (Units - 100.00f); //First 100 units  100-900 ==50
             float amount2 = Units - amount1; //Above 300 units: 1.50Rs per unit==1050

             float sum = (amount1 * multiplier1)+  (amount2 * multiplier2);

             System.out.println("Your  Electricity Bill is: " + sum);
         }else if (Units>200 && Units <=300){
             float amount1 = Units - (Units - 100.00f); //First 100 units  100-900 ==50
             float amount2 = Units - amount1;//Next 100 units (101-200): 0.75Rs per unit ==75
             float amount3 = Units - (Units - 100.00f);//Next 100 units (201-300): 1.20Rs per unit==120
                         float sum = (amount1 * multiplier1)+  (amount2 * multiplier2)+ (amount3 * multiplier3);

             System.out.println("Your  Electricity Bill is: " + sum);
         }else if (Units>300){
            float amount1 = Units - (Units - 100.00f); //First 100 units  100-900 ==50
            float amount2 = Units - (Units - 100.00f);//Next 100 units (101-200): 0.75Rs per unit ==75
            float amount3 = Units - (Units - 100.00f);//Next 100 units (201-300): 1.20Rs per unit==120
            float amount4 = Units - amount1 -amount2- amount3;          //Above 300 units: 1.50Rs per unit==1050

            float sum = (amount1 * multiplier1)+  (amount2 * multiplier2)+  (amount3 * multiplier3)+  (amount4 * multiplier4);

            System.out.println("Your  Electricity Bill is: " + sum);
        }
        sc.close();

    }


    }




