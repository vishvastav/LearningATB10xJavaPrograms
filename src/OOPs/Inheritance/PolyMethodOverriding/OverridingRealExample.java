package OOPs.Inheritance.PolyMethodOverriding;

public class OverridingRealExample {
    public static void main(String[] args) {
        TC1 Tc1 = new TC1();
        Tc1.openBrowser();
        TC2 Tc2 = new TC2();
        Tc2.openBrowser();
    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Open browser in 5 sec");
    }
}
class TC1 extends CommonToAll{
    void startTC1(){
        openBrowser();
    }
}
class TC2 extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Open browser in 2 sec");
    }
}