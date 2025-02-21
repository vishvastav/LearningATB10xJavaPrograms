package OOPs;

public class Ex_005_Cat {
    public static void main(String[] args) {
        Cat C1 = new Cat();

        C1.running();
    }


}

class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}