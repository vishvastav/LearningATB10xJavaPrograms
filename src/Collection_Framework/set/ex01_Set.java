package Collection_Framework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ex01_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Vishal");
        hs.add("Vishal");
        hs.add("Vishkal");
        hs.add("vishal");
        System.out.println(hs);


    }
}
