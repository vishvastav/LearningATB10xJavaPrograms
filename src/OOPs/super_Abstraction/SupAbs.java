package OOPs.super_Abstraction;

public class SupAbs {
    public static void main(String[] args) {
        Car  C = new Car(1000);
        C.display();

    }
}
//Single inheritence
class Car extends Vehicle{
    private int maxSpeed =281;
    Car(){
        super(100);

    }
    Car(int a){
        System.out.println("PC Car");
    }

    @Override
    void display() {
        System.out.println("Overide-Car");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
    }
}



class Vehicle{
    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default Constructor");
    }

    Vehicle(int a) {
        System.out.println("Param Con");;
    }
    void message(){
        System.out.println("No return No Argument");
    }
    void message(int a){
        System.out.println("PC- Argument");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}