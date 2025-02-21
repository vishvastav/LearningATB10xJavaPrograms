package OOPs.Encapsulation;

public class EncapRealExample {
    public static void main(String[] args) {
        ICICBank Amit = new ICICBank("Amit",100);
        System.out.println(Amit.getBal());
        Amit.setBal(1000,true);

    }

}

class ICICBank{
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
        } else System.out.println("Only Cashier can update the balance");
    }

    public ICICBank(String name_C, long bal_C) {
        this.name = name_C;
        this.bal = bal_C;
    }
}