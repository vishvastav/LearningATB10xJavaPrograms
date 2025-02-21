package OOPs.Abstraction;

public class Interface_P2 {
    public static void main(String[] args) {
        P p = new P();
        p.icm1();
        p.icm2();
    }
}

class P implements I1{

    @Override
    public void icm1() {
        System.out.println("IC1 Complete");
    }

    @Override
    public void icm2() {
        System.out.println("IC2 Complete");

    }
}


interface I1{
    void icm1();
    void icm2();
}

interface I2{
    void icm3();
}
