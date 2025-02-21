package OOPs.accessModifier.cop;

public class SrCop {
    public int gun;
    String iCard;

    public SrCop(int gun){
        this.gun=gun;

    }
    protected void canIShoot(){
        System.out.println("Yes You can shoot");
    }
}
