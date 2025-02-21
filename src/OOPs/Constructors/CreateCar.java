package OOPs.Constructors;

import java.util.Scanner;

public class CreateCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car2 C1 = new Car2();
        System.out.println(C1.model + " " + C1.year);
        Car2 C2 = new Car2("ABC CAR",1990);
        System.out.println(C2.model);
        System.out.println(C2.year);
    }
}
