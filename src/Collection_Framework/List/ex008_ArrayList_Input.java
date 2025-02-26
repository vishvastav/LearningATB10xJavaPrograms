package Collection_Framework.List;

import java.util.ArrayList;
import java.util.Scanner;

public class ex008_ArrayList_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";
        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter age:");
            int age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("DO you wany to enter another record? (Y/N): ");
            continueInput = sc.nextLine();

        }
        for (Object o1: names){
            System.out.println(o1);
        }
        for (Object o2: ages){
            System.out.println(o2);
        }
    }
}
