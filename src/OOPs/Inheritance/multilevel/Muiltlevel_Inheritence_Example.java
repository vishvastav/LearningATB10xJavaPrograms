package OOPs.Inheritance.multilevel;

public class Muiltlevel_Inheritence_Example {
    public static void main(String[] args) {

        GrandFather GF = new GrandFather();
        Father F = new Father();
        Son S = new Son();
        S.bhk3();
        S.bhk2();
        S.gf();
        F.bhk2();
        S.home();
        GrandFather GFSon = new Son();

    }
}
