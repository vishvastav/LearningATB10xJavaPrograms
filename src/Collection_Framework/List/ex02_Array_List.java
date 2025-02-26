package Collection_Framework.List;

import java.util.*;


public class ex02_Array_List {
    public static void main(String[] args) {

        List list = new  ArrayList();
        list.add("1");
        list.add("1");
        list.add("3");
        list.add("3");
        list.add("4");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);

        }
    }
}
