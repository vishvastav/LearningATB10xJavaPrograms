package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ex006_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Apple");
        l.add("Orange");
        List<String> l2 = new ArrayList<>();
        l2.add("Apple2");
        l2.add("Orange2");
        List<String> l3 = new ArrayList<>();
        l3.add("Apple3");
        l3.add("Orange3");

        List allfruit = new ArrayList<>();
        allfruit.add(l);
        allfruit.add(l2);
        allfruit.add(l3);
        System.out.println(allfruit);


    }
}
