package OOPs.Abstraction;

public class MultileInheritence_DiamondProblem_Solved {
    public static void main(String[] args) {
        Child1 c1 =new Child1();
        c1.money();
    }

}

class Child1 implements Father1,Mother1{

    @Override
    public void money() {
        System.out.println("only one money");
    }

    @Override
    public void m1() {

    }

    @Override
    public void f1() {

    }
}



interface Mother1{
    void money();
    void m1();
}
interface Father1{
    void money();
    void f1();
}