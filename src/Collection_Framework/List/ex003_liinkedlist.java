package Collection_Framework.List;

import java.util.LinkedList;
import java.util.List;

public class ex003_liinkedlist {
    public static void main(String[] args) {

        List linkedList = new LinkedList();
        linkedList.add("Vishal");
        linkedList.add("kritika");
        linkedList.add("Vini");
        linkedList.add("Divi");
        linkedList.add(123);
        linkedList.add(null);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(null));
        System.out.println(linkedList.size());
    }
}
