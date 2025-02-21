package OOPs;

public class CarConstructor {
    public static void main(String[] args) {
        Car C3 = new Car();
        Car C1 = new Car("Pulse",1960);
        Car C2 = new Car("Honda", 2006);

        System.out.println(C1.model +" " + C1.year);
        System.out.println(C2.model +" " + C2.year);
    }
}
