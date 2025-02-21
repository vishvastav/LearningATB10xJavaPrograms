package OOPs.Abstraction;

import java.util.WeakHashMap;

public class Ex_AC {
    public static void main(String[] args) {
        WagonR WR = new WagonR();
        WR.drive();

    }

}
//
class WagonR extends Engine{
    @Override
    void startEngine() {
        System.out.println("Start");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop");
    }

    void drive(){
        startEngine();
        System.out.println("I m driving");
        stopEngine();

    }
}
abstract  class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}