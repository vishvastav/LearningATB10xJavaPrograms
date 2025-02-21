package OOPs.Constructors;


import OOPs.CarConstructor;

public class Ex_008_Car {
    public static void main(String[] args) {
        Ex_007_Car Tesla = new Ex_007_Car();
        System.out.println(Tesla.name);
        Tesla.name = "Eco";
        System.out.println(Tesla.name);

    }
}
