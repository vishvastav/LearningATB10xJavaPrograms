package Collection_Framework.List;

import java.util.Vector;

public class ex004_Vector {
    public static void main(String[] args) {

        Vector v = new Vector<>();

        v.add("qwert");
        v.add(null);
        v.add(123);
        System.out.println(v);
        System.out.println(v.size());
    }
}
