package OOPs.Inheritance.PolymorphismMethodOverloading;

public class MOloading {
    public static void main(String[] args) {
        MathOperations mat = new MathOperations();
        int r = mat.add(2,3);
        int d = mat.add(2,3,4);
        double f = mat.add(3.14,3.14);
        System.out.println(r);
        System.out.println(d);
    }
}
