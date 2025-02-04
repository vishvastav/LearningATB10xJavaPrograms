package Task;

public class pyramid_triangle {
    public static void main(String[] args) {
        /* Print pyramid in following format
        * 1 2 3 4
        * 5 6 7
        * 8 9
        * 10*/

//        for (int i = 1; i <=10; i++) {
//            System.out.print(i);
//        int b[] = {1 ,4 ,6,7        };
//        System.out.println(b[0]);

        int a = 2, b=3, c=2, d=3;
        a=a+b-a;
        b=a+b-b;
        System.out.println(a);
        System.out.println(b);

        c =c+d ;
        d =c-d;
        c=c-d;


        System.out.println(c);
        System.out.println(d);

    }
}
