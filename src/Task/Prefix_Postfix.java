package Task;

public class Prefix_Postfix {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++); // 10 + 12 + 12 // output:  34

        System.out.println(a); // output:  34

        a = 5;

        System.out.println(--a + a++ + a--); // output:  4 + 5 + 4// output:  13
        System.out.println(a); // output:  4
        //output 34 13 13 4u77u
    }
}
