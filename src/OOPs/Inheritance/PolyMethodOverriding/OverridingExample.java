package OOPs.Inheritance.PolyMethodOverriding;

public class OverridingExample {
    public static void main(String[] args) {

        Father F = new Father();
        Vishal V = new Vishal();
        Father F1 = new Vishal();
        F1.home();

        F.home();
        V.home();
    }
}
