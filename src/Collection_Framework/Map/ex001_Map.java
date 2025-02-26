package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class ex001_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap<>();
        //Map is a key-value
        //name:vishal
        //rollno:1
        //phone:958739234
        m1.put("name","vishal");
        m1.put("name2","vishajkl");
        m1.put("name4",null);
        m1.put("roll no",1);
        m1.put("phone",87865668);
        System.out.println(m1);

//        for (Map.Entry<String, Integer> item : m1. entrySet()) {
//            System.out.println(item.getKey() + + item.getValue()); } I
//
//
//        for (Map.Entry<String, Integer> item : m1.entrySet()){
//            System.out.println(item.getKey() + "------->" + item.getValue());
//        }
    }
}
